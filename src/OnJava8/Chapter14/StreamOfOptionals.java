package OnJava8.Chapter14;

import java.util.Optional;

/**
 * Class StreamOfOptionals is created on 2020/1/13 19:16.
 *
 * @author Ray
 * @version 2020/1/13
 **/

public class StreamOfOptionals {
    public static void main(String[] args) {
        Signal.stream()
                .limit(10)
                .forEach(System.out::println);
        System.out.println(" ---");
        Signal.stream()
                .limit(10)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .forEach(System.out::println);
    }
}
