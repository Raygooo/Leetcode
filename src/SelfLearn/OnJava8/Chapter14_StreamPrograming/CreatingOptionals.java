package SelfLearn.OnJava8.Chapter14_StreamPrograming;

import java.util.Optional;

/**
 * Class CreatingOptionals is created on 2020/1/13 16:21.
 *
 * @author Ray
 * @version 2020/1/13
 **/

public class CreatingOptionals {
    static void test(String testName, Optional<String> opt) {
        System.out.println(" === " + testName + " === ");
        System.out.println(opt.orElse("Null"));
    }

    public static void main(String[] args) {
        test("empty", Optional.empty());
        test("of", Optional.of("Howdy"));

        try {
            test("of", Optional.of(null));
        } catch (Exception e) {
            System.out.println(e);
        }
        test("ofNullable", Optional.ofNullable("Hi"));
        test("ofNullable", Optional.ofNullable(null));
    }
}
