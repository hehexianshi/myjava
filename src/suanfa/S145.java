package suanfa;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/28 14:55
 * @changeRecord
 */
public class S145 {
    /**
     * 给定一个二叉树，返回它的 后序 遍历。
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

    public static void main(String[] args) {
        S145 s145 = new S145();
        s145.run();
    }

    public void run() {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);

        treeNode.right = treeNode1;
        treeNode1.left = treeNode2;

        List<Integer> integers = this.postorderTraversal(treeNode);

    }

    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<TreeNode> treeNodes = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();

        if (root == null) {
            return output;
        }

        treeNodes.add(root);

        while (!treeNodes.isEmpty()) {
            TreeNode treeNode = treeNodes.pollLast();

            output.addFirst(treeNode.val);

            if (treeNode.left != null) {
                treeNodes.add(treeNode.left);
            }

            if (treeNode.right != null) {
                treeNodes.add(treeNode.right);
            }

        }

        return output;
    }
}
