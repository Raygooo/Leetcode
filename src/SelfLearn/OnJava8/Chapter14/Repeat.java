package SelfLearn.OnJava8.Chapter14;

import java.util.stream.IntStream;

/**
 * Class Repeat is created on 2020/1/4 18:39.
 *
 * @author Ray
 * @version 2020/1/4
 **/

public class Repeat {
    public static void repeat(int n, Runnable action) throws InterruptedException {
        Thread.sleep(1000);
        IntStream.range(0, n).forEach(i -> action.run());
    }
}
