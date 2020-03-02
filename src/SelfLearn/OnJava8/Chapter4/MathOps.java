package SelfLearn.OnJava8.Chapter4;

import java.util.Random;

/**
 * Class MathOps is created on 2020/1/19 13:17.
 *
 * @author Ray
 * @version 2020/1/19
 **/

public class MathOps {
    public static void main(String[] args) {
        //创建一个诞生于种子的伪随机数生成器
        Random rand = new Random(47);
        int i, j, k;
        //选择1到100的值
        j = rand.nextInt(100) + 1;
        System.out.println("j : " + j);
        k = rand.nextInt(100) + 1;
        System.out.println("k : " + k);
        i = j + k;
        System.out.println("j + k : " + i);
        i = j - k;
        System.out.println("j - k : " + i);
        i = k / j;
        System.out.println("k / j : " + i);
        i = k * j;
        System.out.println("k * j : " + i);
        i = k % j;
        System.out.println("k % j : " + i);
        j %= k;
        System.out.println("j %= k : " + j);
        //浮点运算
        float u, v, w; //double同样适用
        v = rand.nextFloat();
        System.out.println("v : " + v);
        w = rand.nextFloat();
        System.out.println("w : " + w);
        u = v + w;
        System.out.println("v + w : " + u);
        u = v - w;
        System.out.println("v - w : " + u);
        u = v * w;
        System.out.println("v * w : " + u);
        u = v / w;
        System.out.println("v / w : " + u);
        //下面的操作同样适用于char, byte, short, int, long, double
        u += v;
        System.out.println("u += v : " + u);
        u -= v;
        System.out.println("u -= v : " + u);
        u *= v;
        System.out.println("u *= v : " + u);
        u /= v;
        System.out.println("u /= v : " + u);

    }
}
