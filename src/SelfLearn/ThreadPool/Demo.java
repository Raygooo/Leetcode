package SelfLearn.ThreadPool;

import java.util.concurrent.*;

/**
 * Class Demo is created on 2020/4/2 12:12.
 *
 * @author Ray
 * @version 2020/4/2
 **/

public class Demo {
    final ThreadPoolExecutor pool = new ThreadPoolExecutor(
            3,
            5,
            60,
            TimeUnit.MILLISECONDS,
            new ArrayBlockingQueue<>(5));

    ExecutorService pool2 = Executors.newFixedThreadPool(5);

    public Demo(){

    }

}
