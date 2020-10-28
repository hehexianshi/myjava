package suanfa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/10/16 17:47
 * @changeRecord
 */
public class S102 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        S102 s102 = new S102();
        s102.test();

    }

    List<List<Integer>> arrayList;

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();

        if (root == null) {
            return ret;
        }

        LinkedList<TreeNode> treeNodes = new LinkedList<>();

        treeNodes.offer(root);

        while (!treeNodes.isEmpty()) {
            List<Integer> newList = new ArrayList<>();
            int size = treeNodes.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = treeNodes.poll();
                newList.add(poll.val);

                if (poll.left != null) {
                    treeNodes.offer(poll.left);
                }

                if (poll.right != null) {
                    treeNodes.offer(poll.right);
                }

            }

            ret.add(newList);
        }

        return ret;
    }

    private void test() {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(10);
        treeNode.right = new TreeNode(20);

        System.out.println(levelOrder(treeNode));
    }
}
