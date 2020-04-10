package OnJava8.Chapter14;

/**
 * Class NumericStreamInfo is created on 2020/1/13 22:06.
 *
 * @author Ray
 * @version 2020/1/13
 **/

public class NumericStreamInfo {
    int mark;

    public static void main(String[] args) {
        System.out.println(RandInts.rands().average().orElseThrow());
        System.out.println(RandInts.rands().max().orElseThrow());
        System.out.println(RandInts.rands().min().orElseThrow());
        System.out.println(RandInts.rands().sum());
        System.out.println(RandInts.rands().summaryStatistics());
    }
}
