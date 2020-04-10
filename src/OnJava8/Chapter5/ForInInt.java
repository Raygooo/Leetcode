package OnJava8.Chapter5;

import static OnJava8.Chapter5.Range.*;

/**
 * Class ForInInt is created on 2020/3/2 18:19.
 *
 * @author Ray
 * @version 2020/3/2
 **/

public class ForInInt {
    public static void main(String[] args) {
        for (int i :
                range(10)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i :
                range(5, 10)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i :
                range(5, 20, 3)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i :
                range(20, 5, -3)) {
            System.out.print(i + " ");
        }
    }
}
