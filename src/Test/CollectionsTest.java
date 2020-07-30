package Test;

import Test.Common.Thing;

import java.util.HashSet;

public class CollectionsTest {

    public final HashSet<Thing> thingHashSet = new HashSet<>();

    public CollectionsTest() {
    }


    public static void main(String[] args) {
        CollectionsTest co = new CollectionsTest();
        co.thingHashSet.add(new Thing(12, "1"));
        co.thingHashSet.add(new Thing(15, "2"));
        co.thingHashSet.add(new Thing(12, "3"));
        System.out.println(co.thingHashSet);
    }
}
