package OnJava8.Chapter6;

/**
 * Class EnumOrder is created on 2020/6/29 22:30.
 *
 * @author Ray
 * @version 2020/6/29
 **/

public class EnumOrder {
    public static void main(String[] args) {
        for (Spiciness s : Spiciness.values()) {
            System.out.println(s + ", ordinal " + s.ordinal());
        }
    }
}
