package SelfLearn.OnJava8.Chapter14;

import java.util.stream.Stream;

/**
 * Class Numbered is created on 2020/1/13 12:36.
 *
 * @author Ray
 * @version 2020/1/13
 **/

public class Numbered {
    final int n;
    Numbered(int n){
        this.n = n;
    }

    @Override
    public String toString() {
        return "Numbered{" +
                "n=" + n +
                '}';
    }
}

class FunctionMap2 {
    public static void main(String[] args) {
        Stream.of(1,5,7,9,11,13)
                .map(Numbered::new)
                .forEach(System.out::println);
    }
}
