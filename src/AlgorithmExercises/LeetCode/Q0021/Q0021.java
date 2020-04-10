package AlgorithmExercises.LeetCode.Q0021;

/**
 * Class Q0021 is created on 2019/12/5 17:03.
 *
 * @author Ray
 * @version 2019/12/5
 **/

public class Q0021 {
}
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}


class Solution1 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode pointer = dummyHead;

        while(l1 != null && l2 != null) {
            if (l1.val < l2.val){
                pointer.next = l1;
                l1 = l1.next;
            } else {
                pointer.next = l2;
                l2 = l2.next;
            }
            pointer = pointer.next;
        }

        pointer.next = l1 == null ? l2 : l1;

        return dummyHead.next;
    }

}
