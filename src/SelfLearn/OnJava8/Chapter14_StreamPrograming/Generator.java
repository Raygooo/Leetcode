package SelfLearn.OnJava8.Chapter14_StreamPrograming;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Class Generator is created on 2020/1/4 18:50.
 *
 * @author Ray
 * @version 2020/1/4
 **/

public class Generator implements Supplier<String> {
    Random rand = new Random(47);
    char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();


    @Override
    public String get() {
        return "" + letters[rand.nextInt(letters.length)];
    }

    public static void main(String[] args) {
        String word = Stream.generate(new Generator())
                .limit(60)
                .collect(Collectors.joining());
        System.out.println(word);
    }
}
