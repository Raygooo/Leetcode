package OnJava8.Chapter4;

/**
 * Class Overflow is created on 2020/1/27 21:32.
 *
 * @author Ray
 * @version 2020/1/27
 **/

public class Overflow {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("big = " + big);
        int bigger = big * 4;
        System.out.println("bigger = " + bigger);
    }
}
