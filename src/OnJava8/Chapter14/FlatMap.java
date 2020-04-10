package OnJava8.Chapter14;

import java.util.stream.Stream;

/**
 * Class FlatMap is created on 2020/1/13 12:53.
 *
 * @author Ray
 * @version 2020/1/13
 **/

public class FlatMap {
    public static void main(String[] args) {
        Stream.of(1, 2, 3)
                .flatMap(i -> Stream.of("Apple", "Microsoft", "Amazon"))
                .forEach(System.out::println);
    }
}
