package SelfLearn.MyQuestionSet;


import com.sun.source.tree.Tree;

import javax.swing.plaf.InsetsUIResource;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Class ScanThroughTree is created on 2019/12/24 17:49.
 *
 * @author Ray
 * @version 2019/12/24
 **/

public class ScanThroughTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(-4);
        root.left.right = new TreeNode(1);
        root.right = new TreeNode(3);
        recursiveLevelOrder(root);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //*************************递归*******************************
    //前序遍历
    public static void recursivePreOrder(TreeNode node) {
        if (node == null)
            return;
        visit(node);
        recursivePreOrder(node.left);
        recursivePreOrder(node.right);
    }

    //中序遍历
    //中序遍历在二叉搜索树中很有用，因为是按照搜索树顺序来进行遍历的。
    public static void recursiveInOrder(TreeNode node) {
        if (node == null)
            return;
        recursiveInOrder(node.left);
        visit(node);
        recursiveInOrder(node.right);
    }


    //后序遍历
    public static void recursivePostOrder(TreeNode node) {
        if (node == null)
            return;
        recursivePostOrder(node.left);
        recursivePostOrder(node.right);
        visit(node);
    }


    //***********************非递归*******************************
    //前序遍历
    //手算思想，边访问边找，找左再找右
    public static void iterativePreOrder(TreeNode node) {
        if (node == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                visit(node);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop().right;
        }
    }

    //前序遍历
    //栈的思想，按层次倒着进栈，利用后进先出解决顺序问题
    public static void iterativePreOrder2(TreeNode node) {
        if (node == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            node = stack.pop();
            visit(node);
            if (node.left != null)
                stack.push(node.left);
            if (node.right != null)
                stack.push(node.right);
        }
    }

    //中序遍历
    public static void iterativeInOrder(TreeNode node) {
        if (node == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            visit(node);
            node = node.right;
        }
    }

    //后序遍历
    public static void iterativePostOrder(TreeNode node) {
        if (node == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = node;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.peek().right;
            if (node == null || node == pre) {
                //若栈顶节点的右节点为空或者已经访问过，者按照顺序应该访问栈顶的节点
                node = stack.pop();
                visit(node);
                //pre用来标记已经访问过这个节点
                pre = node;
                node = null;
            }
        }
    }

    //后序遍历
    public static void iterativePostOrder2(TreeNode node) {
        if (node == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = node;
        while (node != null) {
            while (node.left != null) {
                stack.push(node);
                node = node.left;
            }
            while (node != null && (node.right == null || node.right == pre)) {
                visit(node);
                pre = node;
                if (stack.isEmpty())
                    return;
                node = stack.pop();
            }
            stack.push(node);
            node = node.right;
        }
    }

    //后序遍历
    //双栈法，易于理解，先前序遍历，然后把结果倒着输出出来
    public static void iterativePostOrder3(TreeNode node) {
        if (node == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> result = new Stack<>();
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                result.push(node);
                node = node.right;
            }
            node = stack.pop().left;
        }
        while (!result.isEmpty()) {
            node = result.pop();
            visit(node);
        }
    }

    //层次遍历
    public static void iterativeLevelOrder(TreeNode node) {
        if (node == null)
            return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            node = queue.poll();
            visit(node);
            if (node.left != null)
                queue.offer(node.left);
            if (node.right != null)
                queue.offer(node.right);
        }
    }

    //层次遍历
    //分层输出
    public static void iterativeLevelOrder2(TreeNode node) {
        if (node == null)
            return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            for (int i = 0; i < levelNum; i++) {
                node = queue.poll();
                visit(node);
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            System.out.println();
        }
    }

    //**********非递归的分层输出的层次遍历**********
    //维护两个int，代表上一层和下一层的节点数量，上一层遍历结束之后lineUp = lineDown; lineDown = 0;
    public static void iterativeLevelOrder3(TreeNode node) {
        if (node == null)
            return;
        Queue<TreeNode> queue = new LinkedList<>();
        int lineUp = 1, lineDown = 0;
        queue.offer(node);
        while (!queue.isEmpty()) {
            node = queue.poll();
            visit(node);
            if (node.left != null) {
                queue.offer(node.left);
                lineDown++;
            }
            if (node.right != null) {
                queue.offer(node.right);
                lineDown++;
            }
            if (--lineUp == 0) {
                lineUp = lineDown;
                lineDown = 0;
                System.out.println();
            }
        }
    }

    //**********递归的层次遍历访问**********
    public static void recursiveLevelOrder(TreeNode node) {
        if (node == null)
            return;
        int depth = maxDepth(node);
        for (int i = 0; i <= depth; i++) {
            visitNodeAndDepth(node, i);
        }
    }

    public static void visitNodeAndDepth(TreeNode node, int depth) {
        if (node == null || depth < 1)
            return;
        if (depth == 1) {
            visit(node);
            return;
        }
        visitNodeAndDepth(node.left, depth - 1);
        visitNodeAndDepth(node.right, depth - 1);
    }

    public static int maxDepth(TreeNode node) {
        if (node == null)
            return 0;
        return Math.max(maxDepth(node.left), maxDepth(node.right)) + 1;
    }

    public static void visit(TreeNode treeNode) {
        System.out.print(treeNode.val + " ");
    }
}