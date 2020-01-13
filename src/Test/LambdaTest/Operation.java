package Test.LambdaTest;

import java.util.function.DoubleBinaryOperator;

/**
 * Enum Operaion is created on 2019/12/30 15:48.
 *
 * @author Ray
 * @version 2019/12/30
 **/

public enum Operation {
    PLUS("++", (x, y) -> x * 2 + y);

    private final String Symbol;
    private final DoubleBinaryOperator doubleBinaryOperator;

    Operation(String symbol, DoubleBinaryOperator doubleBinaryOperator) {
        this.Symbol = symbol;
        this.doubleBinaryOperator = doubleBinaryOperator;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "Symbol='" + Symbol + '\'' +
                '}';
    }

    public double apply(double x, double y) {
        return doubleBinaryOperator.applyAsDouble(x, y);
    }

    public double applyInt(double x, double y) {
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(Operation.PLUS.applyInt(1,2));
    }
}
