package LeetCode.Q0092;

/**
 * Class Q0092 is created on 2019/12/3 11:40.
 *
 * @author Ray
 * @version 2019/12/3
 **/

public class Q0092 {
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
 * 用递归总是会超出内存的限制。 优化深度递归的内存 https://blog.csdn.net/qq_39088066/article/details/100727128
 */
class Solution1 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode list = head;
        ListNode next;
        ListNode pre = null;
        ListNode NewStart = null;
        ListNode NewEnd = null;
        ListNode NewStartPre = null;
        int counter = 1;
        while (counter <= n) {
            next = head.next;
            if (counter == m - 1)
                NewStartPre = head;
            if (counter == m)
                NewEnd = head;
            if (counter > m) {
                head.next = pre;
            }
            if (counter == n) {
                NewStart = head;
                if (m != 1)
                    NewStartPre.next = NewStart;
                NewEnd.next = next;
            }
            pre = head;
            head = next;
            counter++;
        }

        if (m == 1)
            return NewStart;
        return list;
    }
}

class Solution2 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode list = head;
        ListNode pre = null;
        ListNode NewStart = null;
        ListNode NewEnd = null;
        ListNode NewStartPre = null;
        int counter = 1;
        while (counter <= n) {
            ListNode next = head.next;
            if (counter == m - 1)
                NewStartPre = head;
            if (counter == m)
                NewEnd = head;
            if (counter > m) {
                head.next = pre;
            }
            if (counter == n) {
                NewStart = head;
                if (m != 1)
                    NewStartPre.next = NewStart;
                NewEnd.next = next;
            }
            pre = head;
            head = next;
            counter++;
        }

        if (m == 1)
            return NewStart;
        return list;
    }
}