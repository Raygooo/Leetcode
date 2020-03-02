package SelfLearn.OnJava8.Chapter4;

import java.util.Random;

/**
 * Class Bool is created on 2020/1/27 15:56.
 *
 * @author Ray
 * @version 2020/1/27
 **/

public class Bool {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("i > j is " + (i > j));
        System.out.println("i < j is " + (i < j));
        System.out.println("i >= j is " + (i >= j));
        System.out.println("i <= j is " + (i <= j));
        System.out.println("i == j is " + (i == j));
        System.out.println("i != j is " + (i != j));
        //int类型并不能用作布尔类型来处理，也就是不能用逻辑连接符
        //-System.out.println("i && j is " + (i && j));
        //-System.out.println("i || j is " + (i || j));
        //-System.out.println("!i is " + !i);
        System.out.println("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));
        System.out.println("(i < 10) || (j < 10) is " + ((i < 10) || (j < 10)));
    }
}
