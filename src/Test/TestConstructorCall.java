package Test;

public class TestConstructorCall {

    private SomeCallback mSomeCallback;

    TestConstructorCall(SomeCallback callback) {
        mSomeCallback = callback;
        callTheCallback();
    }

    void callTheCallback() {
        // mSomeCallback.call(); //这样会导致InitCallback里的 testConstructorCall没有初始化就发送信息过去。
        new Thread(() -> mSomeCallback.call()).start();
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