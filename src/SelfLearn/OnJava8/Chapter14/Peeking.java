package SelfLearn.OnJava8.Chapter14;

/**
 * Class Peeking is created on 2020/1/9 23:42.
 *
 * @author Ray
 * @version 2020/1/9
 **/

public class Peeking {
    public static void main(String[] args) throws Exception {
        FileToWords.stream("src/SelfLearn/OnJava8/Chapter14_StreamPrograming/Cheese.dat")
                .skip(21)
                .limit(4)
                .map(w -> w + " ")
                .peek(System.out::print)
                .map(String::toUpperCase)
                .peek(System.out::print)
                .map(String::toLowerCase)
                .forEach(System.out::print);
    }
}
