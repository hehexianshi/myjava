package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 学而思思维
 * @mobile 18611693075
 * @created 2021/08/31 16:16
 * @changeRecord
 */
public class S31 {

    /**
     * 实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列（即，组合出下一个更大的整数）。
     *
     * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
     *
     * 必须 原地 修改，只允许使用额外常数空间。
     *
     *
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/next-permutation
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */

    public static void main(String[] args) {
        S31 s31 = new S31();
        int[] s = {4,5,2,6,3,1};
        s31.nextPermutation(s);
        for (int length = 0; length < s.length; length++) {
            System.out.println(s[length]);
        }
    }

    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        // 从后往前找到一个升序序列
        // 2 - 6 所以i-- 之后位置在 2，
        // 2之后的数都是降序
        while (i >=0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // 找到比i大的一个数
            int j = nums.length - 1;
            while (j >= 0 && nums[i] >= nums[j]) {
                j--;
            }
            // 因为i后面都是降序，所以 需要拿一个比i大的数据交换位置。

            swap(nums, i, j);
        }

        // 将 倒序变成升序，就是从大数变成小数
        // 631 -> 136
        reverse(nums, i + 1);

    }

    public void reverse(int[] nums, int start) {
        int left = start; int right = nums.length - 1;

        while (left < right) {
            swap(nums, left ,right);
            left++;
            right--;
        }
    }

    private void swap(int[] nums, int left, int right) {
        int num = nums[left];
        nums[left] = nums[right];
        nums[right] = num;
    }

}
