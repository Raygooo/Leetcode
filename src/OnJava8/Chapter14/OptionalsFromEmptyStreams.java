package OnJava8.Chapter14;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Class OptionalsFromEmptyStreams is created on 2020/1/13 14:54.
 *
 * @author Ray
 * @version 2020/1/13
 **/

public class OptionalsFromEmptyStreams {
    public static void main(String[] args) {
        System.out.println(Stream.<String>empty()
                .findFirst());
        System.out.println(Stream.<String>empty()
                .findAny());
        System.out.println(Stream.<String>empty()
                .max(String.CASE_INSENSITIVE_ORDER));
        System.out.println(Stream.<String>empty()
                .min(String.CASE_INSENSITIVE_ORDER));
        System.out.println(Stream.<String>empty()
                .reduce((s1, s2) -> s1 + s2));
        System.out.println(IntStream.empty()
                .average());
    }
}
