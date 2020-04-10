package OnJava8.Chapter14;

import java.util.stream.Stream;

/**
 * Class Bubbles is created on 2020/1/8 10:22.
 *
 * @author Ray
 * @version 2020/1/8
 **/

public class Bubbles {
    public static void main(String[] args) {
        Stream.generate(Bubble::bubbler)
                .limit(3)
                .forEach(System.out::println);
    }
}
