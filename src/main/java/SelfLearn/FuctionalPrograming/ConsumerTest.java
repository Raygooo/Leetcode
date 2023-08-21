package SelfLearn.FuctionalPrograming;

import java.util.function.Consumer;

/**
 * Class ConsumerTest is created on 2019/12/30 16:36.
 *
 * @author Ray
 * @version 2019/12/30
 **/

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = w -> System.out.println(w + "-c2");

        Consumer<String> c3 = c1.andThen(c2).andThen(c1);

        c3.accept("heihei");
    }
}
