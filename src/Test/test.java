package Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Class Test.test is created on 2019/12/3 9:58.
 *
 * @author Ray
 * @version 2019/12/3
 **/

public class test {
    transient public int a;

    public static void main(String[] args) {

        int a = 501, b = 343;
//        a=a+b;
//        b=a-b;
//        a=a-b;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }

    public void set(int i) {
        i = 1;
        i = 2;
        System.out.println(i);
    }
}

interface withMethod {
    default void test() {
        System.out.println("hi");
    }

}

abstract class father {
    public abstract Number set();
}

class son extends father {

    @Override
    public Integer set() {
        return null;
    }
}

