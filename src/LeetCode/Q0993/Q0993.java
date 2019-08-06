package LeetCode.Q0993;

/**
 * Class Q0993 is created on 05/08/2019 23:49.
 *
 * @author Ray
 * @version 05/08/2019
 **/

public class Q0993 {

    public static void main(String[] args) {

    }
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
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root.val == x || root.val == y)
            return false;
        pair pairX = fatherNode_Depth(root, 0, x);
        pair pairY = fatherNode_Depth(root, 0, y);
        return isCousinsHelper(pairX, pairY);
    }

    public pair fatherNode_Depth(TreeNode node, int depth, int value) {
        if (node.left != null && value == node.left.val)
            return new pair(node, depth + 1);
        if (node.right != null && value == node.right.val)
            return new pair(node, depth + 1);
        if (node.left != null && fatherNode_Depth(node.left, depth + 1, value) != null)
            return fatherNode_Depth(node.left, depth + 1, value);
        if (node.right != null && fatherNode_Depth(node.right, depth + 1, value) != null)
            return fatherNode_Depth(node.right, depth + 1, value);
        return null;
    }

    public boolean isCousinsHelper(pair p1, pair p2) {
        return (!p1.father.equals(p2.father)) && p1.depth == p2.depth;
    }

}

class pair {
    public pair(TreeNode father, int depth) {
        this.father = father;
        this.depth = depth;
    }

    TreeNode father;
    int depth;
}
