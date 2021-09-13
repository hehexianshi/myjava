package suanfa;

import java.util.Arrays;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/21 14:16
 * @changeRecord
 */
public class S16 {

    /**
     * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。
     * 找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/3sum-closest
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static void main(String[] args) {
        S16 solutionS16 = new S16();
        int[] sums = new int[]{-1, 2, 1, -4};
        System.out.println(solutionS16.threeSumClosest(sums, 1));

    }

    public int threeSumClosest(int[] nums, int target) {
        int ant = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);

        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int left = i + 1;
            int right = length - 1;

            while (right > left) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - sum) < Math.abs(target - ant)) {
                    ant = sum;
                }

                if (sum > target) {
                    right--;
                } else if(sum < target) {
                    left++;
                } else {
                    return target;
                }
            }
        }
        return ant;
    }
}

