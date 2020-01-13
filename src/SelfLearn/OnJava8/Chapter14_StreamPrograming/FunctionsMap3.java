package SelfLearn.OnJava8.Chapter14_StreamPrograming;

import java.util.stream.Stream;

/**
 * Class FucntionMap3 is created on 2020/1/13 12:39.
 *
 * @author Ray
 * @version 2020/1/13
 **/

public class FunctionsMap3 {
    public static void main(String[] args) {
        Stream.of("5", "7", "9")
                .mapToInt(Integer::parseInt)
                .forEach(n -> System.out.printf("%d ", n));
        System.out.println();

        Stream.of("17", "19", "23")
                .mapToLong(Long::parseLong)
                .forEach(n -> System.out.printf("%d ", n));
        System.out.println();

        Stream.of("17", "1.9", ".23")
                .mapToDouble(Double::parseDouble)
                .forEach(n -> System.out.printf("%.1f ", n));
    }
}
