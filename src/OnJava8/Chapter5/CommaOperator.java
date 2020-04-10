package OnJava8.Chapter5;

/**
 * Class CommaOperator is created on 2020/3/2 18:05.
 *
 * @author Ray
 * @version 2020/3/2
 **/

public class CommaOperator {
    public static void main(String[] args) {
        for (int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
            System.out.println("i = " + i + " j = " + j);
        }
    }
}
