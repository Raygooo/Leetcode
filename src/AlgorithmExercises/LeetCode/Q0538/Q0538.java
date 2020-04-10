package AlgorithmExercises.LeetCode.Q0538;

/**
 * Class Q0538 is created on 2019/12/24 12:41.
 *
 * @author Ray
 * @version 2019/12/24
 **/

public class Q0538 {
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
    public TreeNode convertBST(TreeNode root) {
        helper(root, 0);
        return root;
    }

    public int helper(TreeNode node, int value) {
        if (node == null)
            return value;
        int rightValue = helper(node.right, value);
        node.val += rightValue;
        return helper(node.left, node.val);
    }
}

class Solution2 {
    int pre = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;
        convertBST(root.right);
        root.val += pre;
        pre = root.val;
        convertBST(root.left);
        return root;
    }
}