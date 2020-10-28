package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/10/16 17:27
 * @changeRecord
 */
public class S101 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        TreeNode newRoot = root;
        return isSame(newRoot, root);
    }

    private boolean isSame(TreeNode left, TreeNode right) {

        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }

        return isSame(left.left, right.right) && isSame(left.right, right.left);
    }


    public static void main(String[] args) {
        S101 s101 = new S101();

        s101.test();
    }

    private void test() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(3);

        System.out.println(this.isSymmetric(treeNode));
    }
}
