package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/22 14:15
 * @changeRecord
 */
public class S27 {
    /**
     * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
     *
     * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
     *
     * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/remove-element
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static void main(String[] args) {
        S27 s27 = new S27();
        int[] nums = new int[]{3,2,2,3,1,1};
        System.out.println(s27.removeElement(nums, 3));
        System.out.println(nums.toString());


    }

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {return  0;}

        int index = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;

    }
}
