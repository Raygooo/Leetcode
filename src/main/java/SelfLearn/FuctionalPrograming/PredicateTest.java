package SelfLearn.FuctionalPrograming;

import java.util.function.Predicate;

/**
 * Class PredicateTest is created on 2019/12/30 19:05.
 *
 * @author Ray
 * @version 2019/12/30
 **/

public class PredicateTest {

    public static void main(String[] args) {
        Predicate<String> predicate1 = t -> t.equals("Object");
        Predicate<String> predicate2 = t -> t.startsWith("O");

        //negate()操作用来翻转结果
        System.out.println(predicate1.negate().test("Object"));

        //所有predicate都返回True才返回True
        System.out.println(predicate1.and(predicate2).test("Object"));

        //有一个predicate返回True即返回True
        System.out.println(predicate1.or(predicate2).test("OOOOO"));
    }
}
