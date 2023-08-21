package SelfLearn.DesignPattern.Strategy;

/**
 * Class OperationSubstract is created on 2019/12/30 15:11.
 *
 * @author Ray
 * @version 2019/12/30
 **/

public class OperationSubtract implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
