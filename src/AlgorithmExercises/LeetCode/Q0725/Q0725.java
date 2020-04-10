package AlgorithmExercises.LeetCode.Q0725;

import java.util.Arrays;

/**
 * Class Q0725 is created on 2019/12/3 19:39.
 *
 * @author Ray
 * @version 2019/12/3
 **/

public class Q0725 {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        ListNode root = new ListNode(1);
        System.out.println(Arrays.toString(solution2.splitListToParts(root, 6)));
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
    public ListNode[] splitListToParts(ListNode root, int k) {
        int len = 0;
        ListNode node = root;
        while (node != null) {
            node = node.next;
            len++;
        }
        int eachLen = 1;
        int rest = 0;
        if (len / k != 0) {
            rest = len % k;
            eachLen = len / k;
        }
        ListNode[] lists = new ListNode[k];
        node = root;
        int counter = 0;
        int nodeCounter = 1;
        boolean skip = true;
        while (node != null) {
            ListNode next = node.next;
            if (nodeCounter == 1) {
                lists[counter] = node;
                counter++;
            }
            if (nodeCounter >= eachLen) {
                if (rest > 0 && skip) {
                    rest--;
                    skip = false;
                } else {
                    node.next = null;
                    nodeCounter = 0;
                    skip = true;
                }
            }
            nodeCounter++;
            node = next;
        }
        return lists;
    }
}


/**
 * from leetcode
 */
class Solution2 {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode cur = root;
        int N = 0;
        while (cur != null) {
            cur = cur.next;
            N++;
        }

        int width = N / k, rem = N % k;

        ListNode[] ans = new ListNode[k];
        cur = root;
        for (int i = 0; i < k; ++i) {
            ListNode head = cur;
            for (int j = 0; j < width + (i < rem ? 1 : 0) - 1; ++j) {
                if (cur != null) cur = cur.next;
            }
            if (cur != null) {
                ListNode prev = cur;
                cur = cur.next;
                prev.next = null;
            }
            ans[i] = head;
        }
        return ans;
    }
}

