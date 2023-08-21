package OnJava8.Chapter14;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Class OptionalMao is created on 2020/1/13 18:54.
 *
 * @author Ray
 * @version 2020/1/13
 **/

public class OptionalMap {
    static String[] elements = {"12", "", "23", "45"};

    static Stream<String> stream() {
        return Arrays.stream(elements);
    }

    static void test(String description, Function<String, String> func) {
        System.out.println(" ---( " + description + " )--- ");
        for (int i = 0; i <= elements.length; i++) {
            System.out.println(
                    stream()
                            .skip(i)
                            .findFirst()
                            .map(func)
            );
        }
    }

    public static void main(String[] args) {
        test("Add brackets", s -> "[" + s + "]");
        test("Increment", s -> {
            try {
                return String.valueOf(Integer.parseInt(s) + 1);
            } catch (Exception e) {
                return s;
            }
        });
        test("Replace", s -> s.replace("2", "9"));
        test("Take last digit", s -> s.length() > 0 ? String.valueOf(s.charAt(s.length() - 1)) : s);
    }
}
