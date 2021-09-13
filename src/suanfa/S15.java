package suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/18 16:56
 * @changeRecord
 */
public class S15 {
    public static void main(String[] args) {
        S15 solutionS15 = new S15();
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(solutionS15.threeSum(nums));

    }

    /**
     * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c
     * ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
     *
     * 注意：答案中不可以包含重复的三元组。
     *
     * 采用指针方式
     * i为第一个指针， L>= i+1 R = len && R > L
     *
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/3sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> objects = new ArrayList<>();
        Arrays.sort(nums);
        ArrayList<Integer> objects1 = new ArrayList<>();

        int length = nums.length;

        for (int i = 0; i < length; i++) {
            if (nums[i] > 0) {  break;}

            // 当L，R 确定， i 的值也是定值，所以不能重复
            if (i > 0 && nums[i] == nums[i - 1]) {continue;}

            int L = i + 1;
            int R = length - 1;

            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];

                if (sum == 0) {
                    objects.add(Arrays.asList(nums[i], nums[L], nums[R]));

                    // 当i，R 确定， L 的值也是定值，所以不能重复
                    while (L < R && nums[L] == nums[L+1]) {L++;}

                    // 当L，i 确定， R 的值也是定值，所以不能重复
                    while (L<R && nums[R] == nums[R-1]) {R--;}
                    L++;
                    R--;
                } else if (sum < 0) {
                    L++;
                } else if (sum > 0) {
                    R--;
                }
            }
        }

        return objects;
    }
}


