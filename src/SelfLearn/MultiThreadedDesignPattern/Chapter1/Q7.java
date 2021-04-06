package SelfLearn.MultiThreadedDesignPattern.Chapter1;

public class Q7 {
}

class Mutex {
    private volatile boolean busy = false;

    public void lock() {
        while (busy) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void unlock() {
        busy = false;
        notifyAll();
    }
}

class Mutex2 {
    private long locks = 0;
    private Thread owner = null;

    public synchronized void lock() {
        Thread ct = Thread.currentThread();
        while (locks != 0 && ct != owner) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        owner = ct;
        locks++;
    }

    public synchronized void unlock() {
        Thread ct = Thread.currentThread();
        if (locks > 0 && owner == ct) {
            locks--;
        }
        if (locks == 0) {
            owner = null;
            notifyAll();
        }
    }
}
