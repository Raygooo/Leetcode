package DesignPattern.Builder;

/**
 * Class ChickenBurger is created on 2019/12/12 23:51.
 *
 * @author Ray
 * @version 2019/12/12
 **/

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50f;
    }
}
