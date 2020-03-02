package SelfLearn.OnJava8.Chapter4;

/**
 * Class CastingNumbers is created on 2020/1/27 21:26.
 *
 * @author Ray
 * @version 2020/1/27
 **/

public class CastingNumbers {
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        System.out.println("(int)above: " + (int)above);
        System.out.println("(int)below: " + (int)below);
        System.out.println("(int)fabove: " + (int)fabove);
        System.out.println("(int)fbelow: " + (int)fbelow);
        //截断操作，小数位直接被丢弃
    }
}
