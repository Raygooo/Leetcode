package AlgorithmExercises.LeetCode.Q0328;

/**
 * Class Q0328 is created on 2019/12/3 16:40.
 *
 * @author Ray
 * @version 2019/12/3
 **/

public class Q0328 {
    public static void main(String[] args) {

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution1 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode list = head;
        ListNode second = head.next;
        ListNode oddEnd = null;
        int counter = 1;
        while(head.next != null) {
            ListNode next = head.next;
            head.next = next.next;
            if (counter % 2 == 1)
                oddEnd = head;
            head = next;
            counter++;
        }
        if (counter % 2 == 1) {
            oddEnd = head;
        }
        oddEnd.next = second;
        return list;
    }
}

/**
 * from leetcode
 */
class Solution2 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}

