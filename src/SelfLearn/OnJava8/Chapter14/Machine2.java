package SelfLearn.OnJava8.Chapter14;

import java.util.Arrays;

/**
 * Class Machine2 is created on 2020/1/8 13:51.
 *
 * @author Ray
 * @version 2020/1/8
 **/

public class Machine2 {
    public static void main(String[] args) {
        Arrays.stream(new Operations[]{
                () -> show("Bing"),
                () -> show("Crack"),
                () -> show("Twist"),
                () -> show("Pop"),
        }).forEach(Operations::execute);
    }

    static void show(String message) {
        System.out.println(message);
    }
}
