package SelfLearn.OnJava8.Chapter5;

/**
 * Class IfElse is created on 2020/2/25 22:02.
 *
 * @author Ray
 * @version 2020/2/25
 **/

public class IfElse {
    static int result = 0;

    static void test(int testval, int target) {
        if (testval > target)
            result = +1;
        else if (testval < target)
            result = -1;
        else
            result = 0; //找到一样
    }

    public static void main(String[] args) {
        test(10, 5);
        System.out.println(result);
        test(5, 10);
        System.out.println(result);
        test(5, 5);
        System.out.println(result);
    }
}
