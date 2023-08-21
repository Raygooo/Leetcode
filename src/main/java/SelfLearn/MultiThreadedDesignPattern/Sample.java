package SelfLearn.MultiThreadedDesignPattern;

import java.util.concurrent.locks.ReentrantLock;

public class Sample {
    private final Object a = new Object();

    public void test() {
        ReentrantLock lock = new ReentrantLock();
        Thread thread = new Thread();
        thread.getState();
    }
}
