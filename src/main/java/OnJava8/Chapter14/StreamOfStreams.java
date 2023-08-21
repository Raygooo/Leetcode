package OnJava8.Chapter14;

import java.util.stream.Stream;

/**
 * Class StreamOfStreams is created on 2020/1/13 12:49.
 *
 * @author Ray
 * @version 2020/1/13
 **/

public class StreamOfStreams {
    public static void main(String[] args) {
        Stream.of(1,2,3)
                .map(i-> Stream.of("Apple", "Microsoft", "Amazon"))
                .map(e->e.getClass().getName())
                .forEach(System.out::println);
    }
}
