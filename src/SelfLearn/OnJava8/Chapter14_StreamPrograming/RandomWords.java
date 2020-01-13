package SelfLearn.OnJava8.Chapter14_StreamPrograming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Class RandomWords is created on 2020/1/4 17:20.
 *
 * @author Ray
 * @version 2020/1/4
 **/

public class RandomWords implements Supplier<String> {
    List<String> words = new ArrayList<>();
    Random rand = new Random(47);

    public RandomWords(String filename) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filename));
        //略过第一行
//        for (String line : lines.subList(1, lines.size())) {
//            for (String word : line.split("[ .?,]+"))
//                words.add(word.toLowerCase());
//        }
        lines.subList(1, lines.size())
                .forEach(s -> Arrays.stream(s.split("[ .?,]+"))
                        .forEach(w -> words.add(w.toLowerCase())));
    }

    @Override
    public String get() {
        String word = words.get(rand.nextInt(words.size()));
        System.out.println("Supplier working: " + word);
        return word;
    }

    @Override
    public String toString() {
        return words.stream()
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) throws Exception {
        System.out.println(
                Stream.generate(new RandomWords("Cheese.dat"))
                        .limit(10)
                        .collect(Collectors.joining(" "))
        );
    }
}
