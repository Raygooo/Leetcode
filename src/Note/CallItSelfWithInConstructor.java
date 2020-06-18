package Note;

/**
 * 不要在constructor里面写逻辑，虽然这可能符合直觉，但是会出错
 */
interface SomeCallback {
    void call();
}

public class CallItSelfWithInConstructor implements Runnable {

    private SomeCallback mSomeCallback;
    private volatile boolean doCallback = false;

    CallItSelfWithInConstructor(SomeCallback callback) {
        mSomeCallback = callback;
//        callTheCallback();
        new Thread(this, "callback Thread").start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("construct ok");
    }

    public static void main(String[] args) {
        new InitCallback();
    }

    void callTheCallback() {
        // mSomeCallback.call(); //这样会导致InitCallback里的 testConstructorCall没有初始化就发送信息过去。
//        new Thread(() -> {
//            while (!doCallback) {
//            }
        mSomeCallback.call();
//        }).start();

        //- 还是会有Null pointer错误， 所以这样做就是赌这个类会提前比新线程里的call方法提前执行。
//        try {
//            Thread.sleep(5000);
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        doCallback = true;
        //- 这就是。。。撒手就跑的行为，Thread.start()后面执行什么都会导致这个类的初始化的比callback更慢
        // 但做循环测试貌似每次都能跑掉。。。
        //可能多线程是不能避免的，所以需要notify另一个线程我初始化完了可能是正确的解决方式？
    }

    void doSome() {
        System.out.println("Do Some");
    }

    @Override
    public void run() {
        callTheCallback();
    }
}

class InitCallback {
    CallItSelfWithInConstructor callItSelfWithInConstructor;

    SomeCallback mCallback = new SomeCallback() {
        @Override
        public void call() {
            callItSelfWithInConstructor.doSome();
        }
    };

    InitCallback() {
        callItSelfWithInConstructor = new CallItSelfWithInConstructor(mCallback);
    }
}