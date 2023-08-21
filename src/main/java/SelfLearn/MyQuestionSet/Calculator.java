package SelfLearn.MyQuestionSet;

import java.util.Stack;

/**
 * Class Calculator is created on 2019/12/19 18:24.
 *
 * @author Ray
 * @version 2019/12/19
 **/

public class Calculator {
    public static void main(String[] args) {
        System.out.println(calculate("(1+20)*3/4"));

    }

    public static int calculate(String input) {
        char[] charArray = input.toCharArray();
        Stack<Object> stack = new Stack<>();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= '0' && charArray[i] <= '9') {
                int num = 0;
                while (i < charArray.length && charArray[i] >= '0' && charArray[i] <= '9') {
                    num = num * 10 + (charArray[i] - '0');
                    i++;
                }
                i--;
                if (!stack.isEmpty() && stack.peek().equals('*')) {
                    stack.pop();
                    num *= (Integer) stack.pop();
                } else if (!stack.isEmpty() && stack.peek().equals('/')) {
                    stack.pop();
                    num = (Integer) stack.pop() / num;
                }
                stack.push(num);
            } else if (charArray[i] == ')') {
                while (true) {
                    int num = calculateHelper(stack);
                    if (stack.peek().equals('(')) {
                        stack.pop();
                        stack.push(num);
                        break;
                    }
                }
            } else
                stack.push(charArray[i]);
        }

        while (stack.size() > 1) {
            stack.push(calculateHelper(stack));
        }
        return (Integer) stack.pop();
    }

    private static int calculateHelper(Stack<Object> stack) {
        int num;
        num = (Integer) stack.pop();
        if (stack.pop() == (Character) '+') {
            num += (Integer) stack.pop();
        } else {
            num -= (Integer) stack.pop();
        }
        return num;
    }
}
