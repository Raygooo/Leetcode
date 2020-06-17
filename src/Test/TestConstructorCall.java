package Test;

public class TestConstructorCall {

    private SomeCallback mSomeCallback;
    private boolean doCallback = false;

    TestConstructorCall(SomeCallback callback) {
        mSomeCallback = callback;
        callTheCallback();
    }

    void callTheCallback() {
        // mSomeCallback.call(); //这样会导致InitCallback里的 testConstructorCall没有初始化就发送信息过去。
        new Thread(() -> mSomeCallback.call()).start();

        //- 还是会有Null pointer错误， 所以这样做就是赌这个类会提前比新线程里的call方法提前执行。
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }

    void doSome() {
        System.out.println("Do Some");
    }

    public static void main(String[] args) {
        InitCallback initCallback = new InitCallback();
    }
}

class InitCallback {
    TestConstructorCall testConstructorCall;

    SomeCallback mCallback = new SomeCallback() {
        @Override
        public void call() {
            testConstructorCall.doSome();
        }
    };

    InitCallback(){
        testConstructorCall = new TestConstructorCall(mCallback);
    }
}


interface SomeCallback {
    void call();
}