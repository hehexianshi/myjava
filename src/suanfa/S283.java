package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 学而思思维
 * @mobile 18611693075
 * @created 2021/08/30 18:47
 * @changeRecord
 */
public class S283 {

    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     * @param nums
     */


    public static void main(String[] args) {
        S283 s283 = new S283();
        int[] nums = {0,0,1};
        s283.moveZeroes(nums);
    }
    public void moveZeroes(int[] nums) {
        int index = 0;

        for (int num : nums) {
            if (num != 0) {
               nums[index] = num;
               index++;
            }
        }

        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
