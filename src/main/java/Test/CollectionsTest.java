package Test;

import Test.Common.Thing;

import java.util.HashSet;

public class CollectionsTest {

    public final HashSet<Thing> thingHashSet = new HashSet<>();

    public CollectionsTest() {
    }


    public static void main(String[] args) {
        Type type = Type.valueOf("aaa");
        System.out.println(type);
    }

    public enum Type {
        SOME_TYPE;
    }
}
