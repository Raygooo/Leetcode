package AlgorithmExercises.LeetCode.Q0226;

import AlgorithmExercises.LeetCode.TreeNode;

/**
 * Class Q0226 is created on 2019/12/23 11:48.
 *
 * @author Ray
 * @version 2019/12/23
 **/

public class Q0226 {

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