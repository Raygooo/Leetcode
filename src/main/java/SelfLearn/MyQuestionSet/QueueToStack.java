package SelfLearn.MyQuestionSet;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Class QueueToStack is created on 2019/12/19 21:05.
 *
 * @author Ray
 * @version 2019/12/19
 **/

public class QueueToStack {
    public static void main(String[] args) {
        QueueStack<Integer> queueStack = new QueueStack<>();
        queueStack.push(1);
        queueStack.push(2);
        queueStack.push(3);
        queueStack.push(4);
        System.out.println(queueStack.pop());
        System.out.println(queueStack.pop());
        queueStack.push(5);
        queueStack.push(6);
        System.out.println(queueStack.pop());
        System.out.println(queueStack.pop());
    }
}

class QueueStack<E> {
    private Queue<E> queue1 = new LinkedList<>();
    private Queue<E> queue2 = new LinkedList<>();
    int size = 0;

    public void push(E object) {
        if (queue1.isEmpty())
            queue2.offer(object);
        else
            queue1.offer(object);
    }

    public E pop() {
        if (queue1.isEmpty() && queue2.isEmpty())
            throw new EmptyStackException();
        if (queue1.isEmpty()) {
            while (queue2.size() > 1)
                queue1.offer(queue2.poll());
            return queue2.poll();
        } else {
            while (queue1.size() > 1) {
                queue2.offer(queue1.poll());
            }
            return queue1.poll();
        }
    }

}
