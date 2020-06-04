package AlgorithmExercises.LeetCode.Q0404;

import AlgorithmExercises.LeetCode.TreeNode;

import java.util.Date;

/**
 * Class Q0404 is created on 06/08/2019 21:01.
 *
 * @author Ray
 * @version 06/08/2019
 **/

public class Q0404 {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
    }
}

/**
 * finished on: 21:09
 * time used: 8min
 *
 * 100.00
 * 100.00
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null)
            return 0;
        return sumOfLeftLeavesHelper(root.left, true)
                + sumOfLeftLeavesHelper(root.right, false);
    }

    public int sumOfLeftLeavesHelper(TreeNode t, boolean isLeft) {
        if (t == null)
            return 0;
        if (t.left == null && t.right == null && isLeft) {
            return t.val;
        } else return sumOfLeftLeavesHelper(t.left, true)
                + sumOfLeftLeavesHelper(t.right, false);
    }
}
