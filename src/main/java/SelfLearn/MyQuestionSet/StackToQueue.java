package SelfLearn.MyQuestionSet;

import java.util.*;

/**
 * Class StackToQueue is created on 2019/12/18 18:49.
 *
 * @author Ray
 * @version 2019/12/18
 **/

public class StackToQueue {
    public static void main(String[] args) {
        StackQueue<Integer> stackQueue = new StackQueue<>();
        stackQueue.offer(1);
        stackQueue.offer(2);
        stackQueue.offer(3);
        stackQueue.offer(4);
        System.out.println(stackQueue.poll());
        System.out.println(stackQueue.poll());
        stackQueue.offer(5);
        stackQueue.offer(6);
        System.out.println(stackQueue.poll());
        System.out.println(stackQueue.poll());
    }
}

class StackQueue<E> {
    int size = 0;
    private Stack<E> stack1 = new Stack<>();
    private Stack<E> stack2 = new Stack<>();

    public void offer(E object) {

        while (!stack2.isEmpty())
            stack1.push(stack2.pop());

        stack1.push(object);
        size++;
    }

    public E poll() {
        if (stack1.isEmpty() && stack2.isEmpty())
            throw new EmptyStackException();
        while (!stack1.isEmpty())
            stack2.push(stack1.pop());
        E pop = stack2.pop();
        size--;
        return pop;
    }

    public int size() {
        return size;
    }


}
