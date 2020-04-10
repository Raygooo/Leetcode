package AlgorithmExercises.LeetCode.Q0002;

/**
 * Class Q0002 is created on 2019/12/4 22:07.
 *
 * @author Ray
 * @version 2019/12/4
 **/

public class Q0002 {
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode resultPointer = result;
        int carry = 0;
        while (l1 != null || l2 != null || carry > 0) {
            int number1 = l1 != null ? l1.val : 0;
            int number2 = l2 != null ? l2.val : 0;

            int temp = number1 + number2 + carry;

            resultPointer.next = new ListNode(temp % 10);
            resultPointer = resultPointer.next;

            carry = temp / 10;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }

        return result.next;
    }
}
