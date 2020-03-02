package SelfLearn.OnJava8.Chapter14;

import java.util.Arrays;

/**
 * Class ArrayStream is created on 2020/1/8 14:49.
 *
 * @author Ray
 * @version 2020/1/8
 **/

public class ArrayStreams {
    public static void main(String[] args) {
        //DoubleStream
        Arrays.stream(new double[]{3.14159, 2.718, 1.618})
                .forEach(o -> System.out.printf("%f ", o));
        System.out.println();

        //IntStream
        Arrays.stream(new int[]{1, 3, 5})
                .forEach(o -> System.out.printf("%d ", o));
        System.out.println();

        //LongStream
        Arrays.stream(new long[]{11, 22, 33})
                .forEach(o -> System.out.printf("%d ", o));
        System.out.println();

        //Select duration
        Arrays.stream(new int[]{1, 3, 5, 7, 9, 11, 13, 15}, 3, 6)
                .forEach(o -> System.out.printf("%d ", o));
    }
}
