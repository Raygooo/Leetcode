package SelfLearn.DesignPattern.Strategy;

/**
 * Class StrategyPatternDemo is created on 2019/12/30 15:09.
 *
 * @author Ray
 * @version 2019/12/30
 **/

public class StrategyPatternDemo {
    public static void main(String[] args) {
        //anonymous class 匿名类
        Context context = new Context(new OperationAdd());
        System.out.println(context.doOperation(1, 2));

        context = new Context(new OperationSubtract());
        System.out.println(context.doOperation(1, 2));

        context = new Context(new OperationMultiply());
        System.out.println(context.doOperation(1, 2));

        //extension - Lambda Expression - replace anonymous class
        context = new Context(((num1, num2) -> num1 * 2 + num2));
        System.out.println(context.doOperation(1,2));
    }
}
