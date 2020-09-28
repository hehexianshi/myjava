package suanfa;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/28 14:36
 * @changeRecord
 */
public class S144 {

    /**
     * 给定一个二叉树，返回它的 前序 遍历。
     */

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();

        if (root == null) {
            return output;
        }

        stack.add(root);

        while (!stack.isEmpty()) {
            TreeNode treeNode = stack.pollLast();
            output.add(treeNode.val);

            // 先进right 后出right
            if (treeNode.right != null) {
                stack.add(treeNode.right);
            }

            if (treeNode.left != null) {
                stack.add(treeNode.left);
            }
        }

        return output;
    }


    public static void main(String[] args) {
        S144 s144 = new S144();
        s144.run();
    }

    public void run() {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);

        treeNode.right = treeNode1;
        treeNode1.left = treeNode2;

        this.preorderTraversal(treeNode);
    }
}
