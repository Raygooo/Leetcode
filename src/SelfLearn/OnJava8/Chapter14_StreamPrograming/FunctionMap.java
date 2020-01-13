package SelfLearn.OnJava8.Chapter14_StreamPrograming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Class FuctionMap is created on 2020/1/11 14:43.
 *
 * @author Ray
 * @version 2020/1/11
 **/

public class FunctionMap {
    static String[] elements = {"12", "23", "45"};

    static Stream<String> testStream() {
        return Arrays.stream(elements);
    }

    static void test(String description, Function<String, String> func) {
        System.out.println("---( " + description + " )---");
        testStream()
                .map(func)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        test("add brackets", s -> "[" + s + "]");
        test("Increment", s -> String.valueOf(Integer.parseInt(s) + 1));
        test("Replace", s -> s.replace("2", "9"));
        test("Take last digit", s -> s.length() > 0 ? String.valueOf(s.charAt(s.length() - 1)) : s);
    }
}
