package OnJava8.Chapter14;

import java.util.stream.Stream;

/**
 * Class Fibonacci is created on 2020/1/8 12:21.
 *
 * @author Ray
 * @version 2020/1/8
 **/

public class Fibonacci {
    int x = 1;

    Stream<Integer> numbers() {
        return Stream.iterate(0, i -> {
            int result = x + i;
            x = i;
            return result;
        });
    }

    public static void main(String[] args) {
        new Fibonacci().numbers()
                .skip(20)
                .limit(3)
                .forEach(System.out::println);
    }

}
