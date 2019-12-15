package SelfLearn.DesignPattern.Builder;

/**
 * Class Coke is created on 2019/12/12 23:52.
 *
 * @author Ray
 * @version 2019/12/12
 **/

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30f;
    }
}
