package Draft;

import AlgorithmExercises.LeetCode.TreeNode;
import com.sun.source.tree.Tree;

import java.util.Stack;

/**
 * Class Draft4 is created on 2020/4/7 19:04.
 *
 * @author Ray
 * @version 2020/4/7
 **/

public class Draft4 {
    public void scanTree(TreeNode root){
        if (root == null)
            return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            System.out.println(node.val);
            if (node.left != null)
                stack.push(node.left);
            if (node.right != null)
                stack.push(node.right);
        }
    }

    public void scanTreeForward(TreeNode root) {
        if (root == null)
            return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        TreeNode node = root;

        while (!stack.isEmpty() || node != null) {
            while (node!= null){
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            System.out.println(node.val);
            node = node.right;
        }
    }

    public void scanTreeBackward(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> deStack = new Stack<>();

        TreeNode node = root;
        stack.push(node);

        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                deStack.push(node);
                node = node.left;
            }
            node = stack.pop().right;
        }

        while (!deStack.isEmpty()){
            System.out.println(deStack.pop().val);
        }
    }
}
