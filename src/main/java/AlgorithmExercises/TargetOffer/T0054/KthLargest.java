package AlgorithmExercises.TargetOffer.T0054;

import AlgorithmExercises.LeetCode.TreeNode;

/**
 * Class KthLargest is created on 2020/4/6 22:09.
 *
 * @author Ray
 * @version 2020/4/6
 **/

public class KthLargest {
}

class Solution {
    int count = 0;
    int ans = 0;

    public int kthLargest(TreeNode root, int k) {
        search(root, k);
        return ans;
    }

    public void search(TreeNode root, int k) {
        if(root == null)
            return;
        kthLargest(root.right, k);
        count++;
        if(count == k) {
            ans = root.val;
            return;
        }
        kthLargest(root.left, k);
    }
}
