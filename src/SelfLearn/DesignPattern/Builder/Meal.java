package SelfLearn.DesignPattern.Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Meal is created on 2019/12/12 23:54.
 *
 * @author Ray
 * @version 2019/12/12
 **/

public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
