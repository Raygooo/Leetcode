package TargetOffer.T0059;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

/**
 * Class Q0059 is created on 2020/3/7 13:46.
 *
 * @author Ray
 * @version 2020/3/7
 **/

public class T0059 {
}

class MaxQueue {

    List<Integer> queue = new LinkedList<>();
    List<Integer> dequeue = new LinkedList<>();


    public MaxQueue() {

    }

    public int max_value() {
        return queue.isEmpty() ? -1 : dequeue.get(0);
    }

    public void push_back(int value) {
        queue.add(value);
        while (!dequeue.isEmpty() && value > dequeue.get(dequeue.size() - 1))
            dequeue.remove(dequeue.size() - 1);
        dequeue.add(value);
    }

    public int pop_front() {
        if (queue.isEmpty())
            return -1;
        if (dequeue.get(0).equals(queue.get(0)))
            dequeue.remove(0);
        return queue.remove(0);
    }
}

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */
