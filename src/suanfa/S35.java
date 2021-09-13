package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 学而思思维
 * @mobile 18611693075
 * @created 2021/08/30 17:18
 * @changeRecord
 */
public class S35 {

    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
     * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     *
     * 请必须使用时间复杂度为 O(log n) 的算法
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/search-insert-position
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */

    public static void main(String[] args) {
        S35 s35 = new S35();
        int[] n = {1,3,5,6};
        System.out.println(s35.searchInsert(n, 5));

    }

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int p = left + (right - left) / 2;

            if (nums[p] == target) {
                return p;
            }

            if (nums[p] > target) {
                right = p;
            } else {
                left =  p + 1;
            }
        }

        return left;
    }
}
