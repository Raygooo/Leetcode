package SelfLearn.OnJava8.Chapter14;

/**
 * Class Bubble is created on 2020/1/4 16:37.
 *
 * @author Ray
 * @version 2020/1/4
 **/

public class Bubble {
    public final int num;

    public Bubble(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Bubble{" +
                "num=" + num +
                '}';
    }

    private static int count = 0;
    public static Bubble bubbler() {
        return new Bubble(count++);
    }
}
