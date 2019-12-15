package SelfLearn.DesignPattern.Builder;

/**
 * Class Burger is created on 2019/12/12 23:45.
 *
 * @author Ray
 * @version 2019/12/12
 **/

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
