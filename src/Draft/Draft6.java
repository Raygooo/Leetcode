package Draft;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Class Draft6 is created on 2020/4/8 14:50.
 *
 * @author Ray
 * @version 2020/4/8
 **/

public class Draft6 {
    public static void main(String[] args) {


        printB printB = new printB();
        printC printC = new printC();

        ExecutorService sing = Executors.newSingleThreadExecutor();

        sing.submit(printB);
        sing.submit(printC);

    }


}

class PrintA implements Runnable {


    @Override
    public void run() {

    }

    public synchronized void printA() {

    }
}

class printB implements Runnable {


    @Override
    public void run() {
        System.out.print("b");
    }
}

class printC implements Runnable {


    @Override
    public void run() {
        System.out.print("c");
    }
}
