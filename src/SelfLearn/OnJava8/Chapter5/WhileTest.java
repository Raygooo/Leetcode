package SelfLearn.OnJava8.Chapter5;

/**
 * Class WhileTest is created on 2020/2/25 22:05.
 *
 * @author Ray
 * @version 2020/2/25
 **/


//while(Boolean-expression)
//    statement

//do
//    statement
//while(Boolean-expression)
public class WhileTest {
    static boolean condition() {
        boolean result = Math.random() < 0.99;
        System.out.println(result + ", ");
        return result;
    }

    public static void main(String[] args) {
        while (condition()) {
            System.out.println("Inside While");
        }
        System.out.println("Exit While");
    }
}
