package SelfLearn.OnJava8.Chapter5;

/**
 * Class ForInString is created on 2020/3/2 18:17.
 *
 * @author Ray
 * @version 2020/3/2
 **/

public class ForInString {
    public static void main(String[] args) {
        for (char c :
                "An African Swallow".toCharArray()) {
            System.out.print(c + " ");
        }
    }
}
