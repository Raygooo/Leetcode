package SelfLearn.DesignPattern.Strategy;

/**
 * Class Context is created on 2019/12/30 15:13.
 *
 * @author Ray
 * @version 2019/12/30
 **/

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int doOperation(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
