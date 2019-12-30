package LeetCode.Q0617;

import com.sun.source.tree.Tree;

import java.util.Stack;

/**
 * Class Q0617 is created on 2019/12/22 23:21.
 *
 * @author Ray
 * @version 2019/12/22
 **/

public class Q0617 {
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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null || t2 == null)
            return t1 == null ? t2 : t1;
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left,t2.left);
        t1.right = mergeTrees(t1.right,t2.right);
        return t1;
    }

    public void helper(TreeNode t1, TreeNode t2, TreeNode t3) {
        if (t1==null || t2 == null) {
            t3 = null; //传递进方法的引用就是个备份，如果修改了指向，就等于和原来的传入的引用没关系了。 仿佛重新定义了一个变量。
        }
    }

    public TreeNode mergeTrees2(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;

        Stack<TreeNode[]> stack = new Stack<>();
        stack.push(new TreeNode[] {t1, t2});

        while (!stack.isEmpty()) {
            TreeNode[] t = stack.pop();
            if (t[0] == null || t[1] == null)
                continue;

            t[0].val += t[1].val;

            if (t[0].left == null)
                t[0].left = t[1].left;
            else
                stack.push(new TreeNode[] {t[0].left, t[1].left});

            if (t[0].right == null)
                t[0].right = t[1].right;
            else
                stack.push(new TreeNode[] {t[0].right, t[1].right});
        }
        return t1;
    }
}
