package LeetCode.Q0206;

/**
 * Class Q0206 is created on 2019/12/3 10:50.
 *
 * @author Ray
 * @version 2019/12/3
 **/

public class Q0206 {


}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

/**
 * 迭代
 */
class Solution1 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode Old = head.next;
        ListNode New = null;
        head.next = New;
        while (Old.next != null) {
            New = head;
            head = Old;
            Old = Old.next;
            head.next = New;
        }
        Old.next = head;
        return Old;
    }
}

/**
 * from leetcode 0ms sample
 */
class Solution2 {
    public ListNode reverseList(ListNode head) {
        ListNode next;
        ListNode pre = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}

/**
 * 递归
 */
class Solution3 {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
        return reverse(null, head, head.next);
    }

    private ListNode reverse(ListNode pre, ListNode current, ListNode next) {
        current.next = pre;
        if (next == null)
            return current;
        return reverse(current, next, next.next);
    }
}
