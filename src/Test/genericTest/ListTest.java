package Test.genericTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Thing> things = new ArrayList<>();
        Thing thing = new Thing("Thing1");
        Object o = thing;
        things.add(thing);
        System.out.println(things);
        things.remove(o);
        System.out.println(things);
    }

    public static class Thing {
        public String name;

        public Thing(String name) {
            this.name = name;
        }
    }
}
