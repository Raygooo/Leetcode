package OnJava8.Chapter14;

import java.util.stream.IntStream;

/**
 * Class Ranges is created on 2020/1/4 18:08.
 *
 * @author Ray
 * @version 2020/1/4
 **/

public class Ranges {
    public static void main(String[] args) {
        //传统方法：
        int result = 0;
        for (int i = 10; i < 20; i++) {
            result += i;
        }
        System.out.println(result);
        //for-in 循环：
        result = 0;
        for (int i : IntStream.range(10, 20).toArray())
            result += i;
        System.out.println(result);
        //使用流
        System.out.println(IntStream.range(10,20).sum());
    }
}
