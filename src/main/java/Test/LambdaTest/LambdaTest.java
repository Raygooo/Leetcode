package Test.LambdaTest;

import java.util.*;
import java.util.function.BiFunction;

/**
 * Class LambdaTest is created on 2019/12/30 15:30.
 *
 * @author Ray
 * @version 2019/12/30
 **/

public class LambdaTest {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        Collections.sort(words, Comparator.comparingInt(String::length));//传递方法引用到函数式接口中
        //simpler version
        words.sort(Comparator.comparingInt(String::length));
        Map<Integer, Integer> map = new HashMap<>();
        map.merge(1, 2, new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return null;
            }
        });
    }
}
