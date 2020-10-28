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
 * @created 2020/10/16 18:23
 * @changeRecord
 */
public class S103 {

    /**
     * 给定一个二叉树，返回其节点值的锯齿形层次遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
     * <p>
     * 例如：
     * 给定二叉树 [3,9,20,null,null,15,7],
     * <p>
     * 3
     * / \
     * 9  20
     * /  \
     * 15   7
     * 返回锯齿形层次遍历如下：
     * <p>
     * [
     * [3],
     * [20,9],
     * [15,7]
     * ]
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private void test() {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(10);
        treeNode.right = new TreeNode(20);

        System.out.println(zigzagLevelOrder(treeNode));
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();

        if (root == null) {
            return ret;
        }

        LinkedList<TreeNode> treeNodes = new LinkedList<>();

        treeNodes.offer(root);

        var j = 0;
        while (!treeNodes.isEmpty()) {
            LinkedList<Integer> newList = new LinkedList<>();
            int size = treeNodes.size();
            for (int i = 0; i < size; i++) {

                TreeNode poll = treeNodes.poll();
                if (poll != null) {
                    if (j % 2 == 1) {
                        newList.addFirst(poll.val);
                    } else {
                        newList.addLast(poll.val);
                    }
                }

                if (poll.left != null) {
                    treeNodes.offer(poll.left);
                }

                if (poll.right != null) {
                    treeNodes.offer(poll.right);
                }
            }

            ret.add(newList);
            j++;
        }

        return ret;
    }
}
