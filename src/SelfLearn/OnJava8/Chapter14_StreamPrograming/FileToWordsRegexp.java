package SelfLearn.OnJava8.Chapter14_StreamPrograming;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Class FileToWordsRegexp is created on 2020/1/9 23:36.
 *
 * @author Ray
 * @version 2020/1/9
 **/

public class FileToWordsRegexp {
    private String all;

    public FileToWordsRegexp(String filePath) throws Exception {
        all = Files.lines(Paths.get(filePath))
                .skip(1)//skip comment line
                .collect(Collectors.joining(" "));
    }

    public Stream<String> stream() {
        return Pattern.compile("[ .,?]+")
                .splitAsStream(all);
    }

    public static void main(String[] args) throws Exception {
        FileToWordsRegexp fw = new FileToWordsRegexp("Cheese.dat");

        fw.stream()
                .limit(7)
                .map(w -> w + " ")
                .forEach(System.out::print);

        fw.stream()
                .skip(7)
                .limit(2)
                .map(w -> w + " ")
                .forEach(System.out::print);
    }
}
