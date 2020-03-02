package SelfLearn.OnJava8.Chapter4;

import java.util.Objects;

/**
 * Class PassObject is created on 2020/1/19 12:15.
 *
 * @author Ray
 * @version 2020/1/19
 **/


class Letter {
    char c;
}

public class PassObject {
    static void f(Letter y) {
        Objects.requireNonNull(y);
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
//        x.c = 'a';
        System.out.println("1: x.c: " + x.c);
        f(x);
        System.out.println("2: x.c: " + x.c);
    }
}
