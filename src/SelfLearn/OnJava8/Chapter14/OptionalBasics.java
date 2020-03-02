package SelfLearn.OnJava8.Chapter14;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Class OptionalBasics is created on 2020/1/13 15:46.
 *
 * @author Ray
 * @version 2020/1/13
 **/

public class OptionalBasics {
    static void test(Optional<String> optString) {
        if (optString.isPresent())
            System.out.println(optString.get());
        else
            System.out.println("Nothing inside!");
    }

    public static void main(String[] args) {
        test(Stream.of("Epithets").findFirst());
        test(Stream.<String>empty().findFirst());
    }
}
