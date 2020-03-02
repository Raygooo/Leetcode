package SelfLearn.OnJava8.Chapter14;

/**
 * Class ForEach is created on 2020/1/13 19:32.
 *
 * @author Ray
 * @version 2020/1/13
 **/

public class ForEach {
    static final int SZ = 14;

    public static void main(String[] args) {
        RandInts.rands().limit(SZ)
                .forEach(n -> System.out.printf("%d ", n));
        System.out.println();
        RandInts.rands().limit(SZ)
                .parallel()
                .forEach(n -> System.out.printf("%d ", n));
        System.out.println();
        RandInts.rands().limit(SZ)
                .parallel()
                .forEachOrdered(n -> System.out.printf("%d ", n));
    }
}
