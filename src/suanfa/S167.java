package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 学而思思维
 * @mobile 18611693075
 * @created 2021/08/31 10:34
 * @changeRecord
 */
public class S167 {
    /**
     * 给定一个已按照 非递减顺序排列  的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数 target 。
     *
     * 函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 1 开始计数 ，
     * 所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。
     *
     * 你可以假设每个输入 只对应唯一的答案 ，而且你 不可以 重复使用相同的元素。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */

    public static void main(String[] args) {
        S167 s167 = new S167();

        int[] s = {2,7,11,15};
        int target = 9;
        s167.twoSum(s, target);

    }

    public int[] twoSum(int[] numbers, int target) {
        int left = 1;
        int right = numbers.length ;

        while (left < right) {
            int s = numbers[left - 1] + numbers[right - 1];
            if (s == target) {
                return new int[]{left, right};
            } else if (s > target) {
                right--;
            } else {
                left++;
            }
        }

        return null;
    }
}
