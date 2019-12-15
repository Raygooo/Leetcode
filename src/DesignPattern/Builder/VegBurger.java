package DesignPattern.Builder;

/**
 * Class VegBurger is created on 2019/12/12 23:50.
 *
 * @author Ray
 * @version 2019/12/12
 **/

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25f;
    }
}
