package DesignPattern.Builder;

/**
 * Class ColdDrink is created on 2019/12/12 23:48.
 *
 * @author Ray
 * @version 2019/12/12
 **/

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
