package OnJava8.Chapter4;

/**
 * Class StringOperators is created on 2020/1/27 20:50.
 *
 * @author Ray
 * @version 2020/1/27
 **/

public class StringOperators {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z ";
        System.out.println(s + x + y + z);
        System.out.println(x + " " + s); //将x转换为字符串
        s += "(summed) = ";
        System.out.println(s + (x + y + z)); //级联操作
        System.out.println("" + x);//Integer.toString()简写
    }

}
