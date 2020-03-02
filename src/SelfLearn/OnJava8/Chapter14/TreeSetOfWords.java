package SelfLearn.OnJava8.Chapter14;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * Class TreeSetOfWords is created on 2020/1/13 19:42.
 *
 * @author Ray
 * @version 2020/1/13
 **/

public class TreeSetOfWords {
    public static void main(String[] args) throws Exception {
        Set<String> words2 =
                Files.lines(Paths.get("src/SelfLearn/OnJava8/Chapter14_StreamPrograming/TreeSetOfWords.java"))
                        .flatMap(s -> Arrays.stream(s.split("\\W+")))
                        .filter(s -> !s.matches("\\d+"))
                        .map(String::trim)
                        .filter(s -> s.length() > 2)
                        .limit(100)
                        .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(words2);
    }
}
