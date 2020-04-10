package OnJava8.Chapter14;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Class LastElement is created on 2020/1/13 21:59.
 *
 * @author Ray
 * @version 2020/1/13
 **/

public class LastElement {
    public static void main(String[] args) {
        OptionalInt last = IntStream.range(10,100)
                .reduce((left, right) -> right);
        System.out.println(last.orElse(-1));

        Optional<String> lastStr = Stream.of("one","two","three")
                .reduce(((s, s2) -> s2));
        System.out.println(lastStr.orElse("Nothing here!"));
    }
}
