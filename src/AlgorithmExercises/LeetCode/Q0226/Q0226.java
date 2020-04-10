package AlgorithmExercises.LeetCode.Q0226;

/**
 * Class Q0226 is created on 2019/12/23 11:48.
 *
 * @author Ray
 * @version 2019/12/23
 **/

public class Q0226 {

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
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode tmp = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = tmp;
        return root;
    }
}