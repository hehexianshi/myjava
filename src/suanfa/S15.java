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
        SolutionS15 solutionS15 = new SolutionS15();
        int[] nums = new int[]{0,0,0,0};
        System.out.println(solutionS15.threeSum(nums));

    }
}

/**
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

class SolutionS15 {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> objects = new ArrayList<>();
        Arrays.sort(nums);
        ArrayList<Integer> objects1 = new ArrayList<>();

        int length = nums.length;

        for (Integer i = 0; i < length; i++) {
            if (objects1.contains(i)) {
                continue;
            }
            for (Integer j = i + 1; j < length; j++) {
                if (objects1.contains(j)) {
                    continue;
                }
                for (Integer x = length - 1; x > j; x--) {
                    if (objects1.contains(x)) {
                        continue;
                    }
                    if (nums[i] + nums[j] + nums[x] == 0) {
                        List<Integer> integers = Arrays.asList(nums[i], nums[j], nums[x]);
                        objects.add(integers);
                        objects1.add(i);
                        objects1.add(j);
                        objects1.add(x);
                        break;
                    }
                }
            }
        }
        return objects;
    }
}