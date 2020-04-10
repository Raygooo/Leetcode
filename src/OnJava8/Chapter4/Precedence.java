package OnJava8.Chapter4;

/**
 * Class Precedence is created on 2020/1/19 12:05.
 *
 * @author Ray
 * @version 2020/1/19
 **/

public class Precedence {
    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        int a = x + y - 2 / 2 + z;
        int b = x + (y - 2) / (2 + z);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //打印出来的a和b都已经字符串化了
    }
}
