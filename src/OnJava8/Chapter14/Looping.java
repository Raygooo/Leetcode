package OnJava8.Chapter14;

/**
 * Class Looping is created on 2020/1/4 18:41.
 *
 * @author Ray
 * @version 2020/1/4
 **/

public class Looping {
    private static void hi() {
        System.out.println("Hi!");
    }

    public static void main(String[] args) throws Exception {
        Repeat.repeat(3, () -> System.out.println("Looping!"));
        Repeat.repeat(5, Looping::hi);
    }
}
