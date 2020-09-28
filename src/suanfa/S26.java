package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/22 11:13
 * @changeRecord
 */
public class S26 {

    public static void main(String[] args) {
        S26 s26 = new S26();
        s26.run();

    }

    private void run() {
        Solution solution = new Solution();

        int[] nums = new int[]{1, 1, 2};
        System.out.println(solution.removeDuplicates(nums));
    }

    /**
     * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
     *
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    class Solution {
        public int removeDuplicates(int[] nums) {

            int i = 0;
            int length = nums.length;

            if (length == 0) {return  0;}
            for (int i1 = 1; i1 < length; i1++) {
                if (nums[i] != nums[i1]) {
                    i++;
                    nums[i] = nums[i1];
                }
            }

            return i + 1;
        }
    }
}


