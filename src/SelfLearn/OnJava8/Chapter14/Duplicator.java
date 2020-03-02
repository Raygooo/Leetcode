package SelfLearn.OnJava8.Chapter14;

import java.util.stream.Stream;

/**
 * Class Duplicator is created on 2020/1/8 10:19.
 *
 * @author Ray
 * @version 2020/1/8
 **/

public class Duplicator {
    public static void main(String[] args) {
        Stream.generate(() -> "duplicate")
                .limit(5)
                .forEach(System.out::println);
    }
}
