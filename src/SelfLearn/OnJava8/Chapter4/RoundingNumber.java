package SelfLearn.OnJava8.Chapter4;

/**
 * Class RoundingNumber is created on 2020/1/27 21:28.
 *
 * @author Ray
 * @version 2020/1/27
 **/

public class RoundingNumber {
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        System.out.println(
                "Math.round(above): " + Math.round(above)
        );
        System.out.println(
                "Math.round(below): " + Math.round(below)
        );
        System.out.println(
                "Math.round(fabove): " + Math.round(fabove)
        );
        System.out.println(
                "Math.round(fbelow): " + Math.round(fbelow)
        );
    }
}
