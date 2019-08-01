package Q0155;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Q0155 {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-10);
        minStack.push(14);
        System.out.println(minStack.getMin());
        System.out.println(minStack.getMin());
        minStack.push(-20);
        System.out.println(minStack.getMin());
        System.out.println(minStack.getMin());
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.push(-7);
        System.out.println(minStack.getMin());
        minStack.push(-7);
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.pop();
    }


}

//["MinStack","push","push","getMin","getMin","push","getMin","getMin","top","getMin","pop","push","push","getMin","push","pop","top","getMin","pop"]
//      [[],[-10],[14],[],[],[-20],[],[],[],[],[],[10],[-7],[],[-7],[],[],[],[]]

/**
 * My initial solution
 * <p>
 * runtime: faster than 9.22%
 * Memory usage: less than 36.28%
 */
class MinStack2 {

    /**
     * initialize your data structure here.
     */

    LinkedList<Integer> stack;
    LinkedList<Integer> min;

    public MinStack2() {
        stack = new LinkedList<>();
        min = new LinkedList<>();

    }

    public void push(int x) {

        if (min.size() == 0) {
            min.addFirst(x);
        } else if (x >= min.getLast()) {
            min.addLast(x);
        } else {
            LinkedList<Integer> temp = new LinkedList<>(min);
            int i = 0;
            for (int k :
                    temp) {
                if (x < k) {
                    min.add(i, x);
                    break;
                }
                i++;
            }
        }
        stack.addFirst(x);
    }

    public void pop() {
        if (stack.getFirst().equals(min.getFirst())) {
            min.removeFirst();
        }
        stack.removeFirst();
    }

    public int top() {

        return stack.get(0);
    }

    public int getMin() {
        return min.getFirst();
    }
}

/**
 *
 */
class MinStack {

    /**
     * initialize your data structure here.
     */


    ArrayList<pair> stack;
    int min;

    public MinStack() {
        stack = new ArrayList<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if (x < min)
            min = x;
        stack.add(new pair(x, min));
    }

    public void pop() {
        int size = stack.size();
        if (size == 1)
            min = Integer.MAX_VALUE;
        else min = stack.get(size - 2).getMin();
        stack.remove(size - 1);
    }

    public int top() {
        int size = stack.size();
        return stack.get(size - 1).getX();
    }

    public int getMin() {
        return min;
    }

    class pair {
        int x, min;

        pair(int x, int min) {
            this.x = x;
            this.min = min;
        }

        public int getX() {
            return x;
        }

        public int getMin() {
            return min;
        }
    }
}