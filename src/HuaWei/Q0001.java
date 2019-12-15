package HuaWei;

import java.util.Scanner;

/**
 * Class Q0001 is created on 2019/12/10 19:43.
 *
 * @author Ray
 * @version 2019/12/10
 **/

public class Q0001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }
}
