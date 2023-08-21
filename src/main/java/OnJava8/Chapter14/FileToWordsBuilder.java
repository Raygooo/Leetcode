package OnJava8.Chapter14;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Class FileToWordsBuilder is created on 2020/1/8 12:37.
 *
 * @author Ray
 * @version 2020/1/8
 **/

public class FileToWordsBuilder {
    Stream.Builder<String> builder = Stream.builder();

    public FileToWordsBuilder(String filePath) throws Exception {
        Files.lines(Paths.get(filePath))
                .skip(1)
                .forEach(line -> {
                    for (String w : line.split("[ .?,]+"))
                        builder.add(w);
                });
    }

    public void addToBuilder(String word) {
        builder.add(word);
    }

    Stream<String> stream() {
        return builder.build();
    }

    public static void main(String[] args) throws Exception {
        FileToWordsBuilder fileToWordsBuilder =
                new FileToWordsBuilder("src/SelfLearn/OnJava8/Chapter14_StreamPrograming/Cheese.dat");
        fileToWordsBuilder.addToBuilder("OneMoreWord");
        fileToWordsBuilder
                .stream()
                .limit(1000)
                .map(w -> w + " ")
                .forEach(System.out::print);
    }
}
