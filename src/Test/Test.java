package Test;

import java.awt.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    public static void main(String[] args) {
        Set<Integer> intset = Collections.newSetFromMap(new ConcurrentHashMap<>());
        intset.add(1);
        intset.add(2);
        intset.add(3);
        for (int i : intset) {
            System.out.println(i);
            intset.remove(i);
        }
        System.out.println(intset.isEmpty());
    }
}
