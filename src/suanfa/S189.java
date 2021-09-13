package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 学而思思维
 * @mobile 18611693075
 * @created 2021/08/30 17:41
 * @changeRecord
 */
public class S189 {

    /**
     * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
     *
     *  
     *
     * 进阶：
     *
     * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
     * 你可以使用空间复杂度为 O(1) 的 原地 算法解决这个问题吗？
     *
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/rotate-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */

    public static void main(String[] args) {
        S189 s189 = new S189();
        int[] n = {1,2,3,4,5,6,7};
        s189.rotate(n, 3);
    }

    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        reserve(nums, 0, nums.length - 1);
        reserve(nums, 0, k - 1);
        reserve(nums, k, nums.length - 1);

        for (int length = 0; length < nums.length; length++) {
            System.out.println(nums[length]);
        }
    }

    private void reserve(int[] nums, int k, int i) {
        while (k < i) {
            int temp = nums[i];
            nums[i] = nums[k];
            nums[k] = temp;
            k++;
            i--;
        }
    }
}
