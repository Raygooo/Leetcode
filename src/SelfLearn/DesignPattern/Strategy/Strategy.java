package SelfLearn.DesignPattern.Strategy;

/**
 * Interface Strategy is created on 2019/12/30 15:09.
 *
 * @author Ray
 * @version 2019/12/30
 **/

@FunctionalInterface
public interface Strategy {
    int doOperation(int num1, int num2);
}
