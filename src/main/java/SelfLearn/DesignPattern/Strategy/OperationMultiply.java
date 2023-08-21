package SelfLearn.DesignPattern.Strategy;

/**
 * Class OperationMutiply is created on 2019/12/30 15:12.
 *
 * @author Ray
 * @version 2019/12/30
 **/

public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
