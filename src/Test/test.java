package Test;

import java.util.*;

/**
 * Class Test.test is created on 2019/12/3 9:58.
 *
 * @author Ray
 * @version 2019/12/3
 **/

public class test {
    public static void main(String[] args) {
        System.out.println(5 | 3);
        HashMap<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> map = Collections.synchronizedMap(hashMap);

    }

    public void set(int i) {
        i = 1;
        i = 2;
        System.out.println(i);
    }
}

class Animal {
    void eat() {

    }

    ;
}

class Cat extends Animal {
    void eat() {

    }
}
