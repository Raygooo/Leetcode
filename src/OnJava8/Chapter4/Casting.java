package OnJava8.Chapter4;

/**
 * Class Casting is created on 2020/1/27 21:21.
 *
 * @author Ray
 * @version 2020/1/27
 **/

public class Casting {
    public static void main(String[] args) {
        int i = 200;
        long lng = (long) i;
        lng = i; //没有必要的类型提升
        long lng2 = 200;
        i = (int) lng2;//类型收缩 Cast Required
    }
}
