package Test;

/**
 * Class ProducerAndConsumer is created on 2019/12/23 13:39.
 *
 * @author Ray
 * @version 2019/12/23
 **/

public class ProducerAndConsumer {
    private static int count = 0;
    private static final int full = 10;
    private static String lock = "lock";

    static class producer implements Runnable {

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (lock) {
                    while (count == full) {
                        try {
                            lock.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    count++;
                    System.out.println(Thread.currentThread().getName() + " Producer produced, count is " + count);
                    lock.notifyAll();
                }
            }
        }
    }

    static class consumer implements Runnable {

        @Override
        public void run() {
            while (true) {
                try{
                    Thread.sleep(3000);
                }catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (lock) {
                    while (count == 0) {
                        try{
                            lock.wait();
                        }catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    count--;
                    System.out.println(Thread.currentThread().getName() + " Consumer consumed, count is " + count);
                    lock.notifyAll();
                }
            }

        }
    }

    public static void main(String[] args) {
        new Thread(new producer()).start();
        new Thread(new producer()).start();
        new Thread(new producer()).start();
        new Thread(new producer()).start();
        new Thread(new producer()).start();
        new Thread(new producer()).start();
        new Thread(new producer()).start();
        new Thread(new producer()).start();
        new Thread(new producer()).start();
        new Thread(new producer()).start();
        new Thread(new producer()).start();
        new Thread(new producer()).start();
        new Thread(new producer()).start();
        new Thread(new producer()).start();
        new Thread(new consumer()).start();
        new Thread(new consumer()).start();
        new Thread(new consumer()).start();
        new Thread(new consumer()).start();
        new Thread(new consumer()).start();
        new Thread(new consumer()).start();
        new Thread(new consumer()).start();
        new Thread(new consumer()).start();
        new Thread(new consumer()).start();
        new Thread(new consumer()).start();
        new Thread(new consumer()).start();
        new Thread(new consumer()).start();
        new Thread(new consumer()).start();
        new Thread(new consumer()).start();
        new Thread(new consumer()).start();
        new Thread(new consumer()).start();
        new Thread(new consumer()).start();
        new Thread(new consumer()).start();
    }
}
