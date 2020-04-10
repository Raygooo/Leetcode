package OnJava8.Chapter14;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Class RandInts is created on 2020/1/13 19:29.
 *
 * @author Ray
 * @version 2020/1/13
 **/

public class RandInts {
    private static int[] randInts = new Random(47).ints(0, 1000).limit(100).toArray();

    public static IntStream rands() {
        return Arrays.stream(randInts);
    }
}
