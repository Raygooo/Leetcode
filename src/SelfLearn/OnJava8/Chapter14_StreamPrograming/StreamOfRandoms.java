package SelfLearn.OnJava8.Chapter14_StreamPrograming;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Class StreamOfRandoms is created on 2020/1/13 12:57.
 *
 * @author Ray
 * @version 2020/1/13
 **/

public class StreamOfRandoms {
    static Random rand = new Random(47);

    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5)
                .flatMapToInt(i -> IntStream.concat(rand.ints(0, 100).limit(i),
                        IntStream.of(-1)))
                .forEach(n -> System.out.printf("%d ", n));
    }
}
