package LeetCode.Q0104;

/**
 * Class Q0104 is created on 2019/12/23 11:53.
 *
 * @author Ray
 * @version 2019/12/23
 **/

public class Q0104 {
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        else
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}