package LeetCode.Q0124;

import LeetCode.TreeNode;

/**
 * Class Q0124 is created on 2019/12/29 17:22.
 *
 * @author Ray
 * @version 2019/12/29
 **/

public class Q0124 {
}


class Solution {
    int max = Integer.MIN_VALUE;

    public int max_gain(TreeNode node) {
        if (node == null)
            return 0;

        int left = Math.max(max_gain(node.left), 0);
        int right = Math.max(max_gain(node.right), 0);

        int pre = node.val + left + right;
        max = Math.max(max, pre);

        return node.val + Math.max(left,right);
    }

    public int maxPathSum(TreeNode node) {
        max_gain(node);
        return max;
    }
}
