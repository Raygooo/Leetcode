package OnJava8.Chapter4;

/**
 * Class ternary is created on 2020/1/27 20:07.
 *
 * @author Ray
 * @version 2020/1/27
 **/

public class ternary {

    static int ternary(int i) {
        return i < 10 ? i * 100 : i * 10; //三元运算符 可读性稍差
    }

    static int standardIfElse(int i) {
        if (i < 10)
            return i * 100;
        else
            return i * 10;
    }

    public static void main(String[] args) {
        System.out.println(ternary(9));
        System.out.println(ternary(10));
        System.out.println(standardIfElse(9));
        System.out.println(standardIfElse(10));
    }
}
