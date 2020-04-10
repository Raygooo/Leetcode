package Test.TransientTest;

import javax.swing.plaf.FontUIResource;
import java.util.ArrayList;
import java.util.List;

/**
 * Class CovariantTest is created on 2020/4/3 16:08.
 *
 * @author Ray
 * @version 2020/4/3
 **/



class Fruit {
    private int quality = 1;
    public void setQuality(int quality) {
        this.quality = quality;
    }
}

class Apple extends Fruit {
    void AppleCall(){
        System.out.println("Apple Call");
    }
}

class Orange extends Fruit {

}

class Jonathan extends Apple {
    void JonathanCall(){
        System.out.println("Jonathan Call");
    }
}

public class CovariantTest {
    public static void main(String[] args) {
        Fruit[] fruits = new Apple[10];
        testMethod(new Apple[10]);
        test2(new ArrayList<Fruit>());

        final Fruit fruit = new Fruit();
        fruit.setQuality(2);

        List<Fruit> fruitList = new ArrayList<>();
        List<Apple> appleList = new ArrayList<>();
        List<Jonathan> jonathanList = new ArrayList<>();

        List<? extends Object> objects = new ArrayList<String>();

    }


    public static void testMethod(Fruit[] fruits){
        System.out.println();
    }

    static void test2(List<? super Apple> list) {
        list.add(new Apple());
        list.add(new Jonathan());
    }

    static void test3(List<? extends Apple> list) {
        list.get(0).AppleCall();
    }
}