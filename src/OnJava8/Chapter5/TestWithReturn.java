package OnJava8.Chapter5;

/**
 * Class TestWithReturn is created on 2020/3/2 19:10.
 *
 * @author Ray
 * @version 2020/3/2
 **/

public class TestWithReturn {
    static int test(int testVal, int target) {
        if (testVal > target)
            return +1;
        if (testVal < target)
            return -1;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(test(10, 5));
        System.out.println(test(10, 10));
        System.out.println(test(5, 10));
    }
}
