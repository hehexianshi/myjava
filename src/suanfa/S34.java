package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 学而思思维
 * @mobile 18611693075
 * @created 2021/09/01 16:12
 * @changeRecord
 */
public class S34 {

    public int[] searchRange(int[] nums, int target) {

        int[] t = {-1, -1};

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] == target || nums[right] == target) {
                if (nums[left] == target && nums[right] == target) {
                    t[0] = left;
                    t[1] = right;
                    return t;
                } else if (nums[left] == target) {
                    right--;
                } else {
                    left++;
                }

            } else {
                left++;
                right--;
            }
        }

        return t;
    }

    /**
     * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
     *
     * 如果数组中不存在目标值 target，返回 [-1, -1]。
     *
     * 进阶：
     *
     * 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static void main(String[] args) {
        S34 s34 = new S34();

        int[] s = {5,7,7,8,8,10};
        s34.searchRange(s, 8);

    }
}
