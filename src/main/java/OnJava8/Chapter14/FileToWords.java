package OnJava8.Chapter14;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Class FileToWords is created on 2020/1/11 9:35.
 *
 * @author Ray
 * @version 2020/1/11
 **/


public class FileToWords {
    public static Stream<String> stream(String filePath) throws Exception {
        return Files.lines(Paths.get(filePath))
                .skip(1) // First (comment) line
                .flatMap(line ->
//                        Pattern.compile("\\W+").splitAsStream(line));
                        Arrays.stream(line.split("\\W+")));
    }

    public static void main(String[] args) throws Exception {
        FileToWords.stream("Cheese.dat")
                .limit(7)
                .forEach(s -> System.out.printf("%s ", s));
        System.out.println();

        FileToWords.stream("Cheese.dat")
                .skip(7)
                .limit(2)
                .forEach(s -> System.out.printf("%s ", s));
    }
}
