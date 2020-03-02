package SelfLearn.OnJava8.Chapter4;

/**
 * Class ShortCircuit is created on 2020/1/27 16:13.
 *
 * @author Ray
 * @version 2020/1/27
 **/

public class ShortCircuit {
    static boolean test1(int val) {
        System.out.println("test1(" + val + ")");
        System.out.println("result: " + (val < 1));
        return val < 1;
    }

    static boolean test2(int val) {
        System.out.println("test2(" + val + ")");
        System.out.println("result: " + (val < 2));
        return val < 2;
    }

    static boolean test3(int val) {
        System.out.println("test3(" + val + ")");
        System.out.println("result: " + (val < 3));
        return val < 3;
    }

    public static void main(String[] args) {
        boolean b = test1(0) && test2(2) && test3(2);
        System.out.println("expression is " + b);
        //我们可以观察到结果，test3并没有被执行，通过“短路”节省不必要的运算，提高程序潜在的性能
    }
}
