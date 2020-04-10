package OnJava8.Chapter14;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Class OptionalFilter is created on 2020/1/13 17:03.
 *
 * @author Ray
 * @version 2020/1/13
 **/

public class OptionalFilter {
    static String[] elements = {"Foo", "", "Bar", "Baz", "Bingo"};

    static Stream<String> testStream() {
        return Arrays.stream(elements);
    }

    static void test(String description, Predicate<String> predicate) {
        System.out.println(" ---( " + description + " )--- ");
        for (int i = 0; i <= elements.length + 1; i++) {
            System.out.println(
                    testStream()
                            .skip(i)
                            .findFirst()
                            .filter(predicate)
            );
        }
        System.out.println();
    }

    public static void main(String[] args) {
        test("true", str -> true);
        test("false", str -> false);
        test("str != \"\"", str -> !str.equals(""));
        test("str.length() == 3", str -> str.length() == 3);
        test("startsWith(\"B\")", str -> str.startsWith("B"));
    }
}
