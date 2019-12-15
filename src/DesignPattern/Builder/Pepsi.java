package DesignPattern.Builder;

/**
 * Class Pepsi is created on 2019/12/12 23:53.
 *
 * @author Ray
 * @version 2019/12/12
 **/

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35f;
    }
}
