package AlgorithmExercises.LeetCode.Q0083;

import AlgorithmExercises.LeetCode.ListNode;

/**
 * @author :
 * @version :
 */
public class DeleteDuplicates {
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        deleteHelper(head);
        return head;
    }

    void deleteHelper(ListNode node) {
        if (node.next == null)
            return;

        if (node.next.val == node.val) {
            node.next = node.next.next;
            deleteHelper(node);
        } else
            deleteHelper(node.next);
    }
}
