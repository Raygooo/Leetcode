package SelfLearn.FuctionalPrograming;

import java.util.function.Function;

/**
 * Class FuctionTest is created on 2019/12/30 18:48.
 *
 * @author Ray
 * @version 2019/12/30
 **/

public class FunctionTest {
    public static void main(String[] args) {
        Function<Integer, Integer> function1 = s -> s + 1;
        Function<Integer, Integer> function2 = s -> s * 2;


        System.out.println(function2.apply(1));
        System.out.println(function1.apply(1));
        //先执行了function2，后执行了function1
        System.out.println(function1.compose(function2).apply(1));

        //先执行了function1，后置醒了function2
        System.out.println(function1.andThen(function2).apply(1));

        //identity方法会返回一个不进行任何处理的function，即输入值与输出值相等
        System.out.println(Function.identity().apply(1));

        int res = 1;
        while (res < 100) {
            res = function1.apply(res);
        }
        System.out.println(res);
    }
}
