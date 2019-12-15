package SelfLearn.DesignPattern.Builder;

/**
 * Class Bottle is created on 2019/12/12 23:44.
 *
 * @author Ray
 * @version 2019/12/12
 **/

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
