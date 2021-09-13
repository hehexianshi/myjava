package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 学而思思维
 * @mobile 18611693075
 * @created 2021/08/30 17:24
 * @changeRecord
 */
public class S977 {
    /**
     * 给你一个按 非递减顺序 排序的整数数组 nums，
     * 返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
     * @param args
     */

    public static void main(String[] args) {
        S977 s977 = new S977();
        int[] s = {-4,-1,0,3,10};
        System.out.println(s977.sortedSquares(s));
    }

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] s = new int[n];

        for (int i = 0, j = n - 1, pos = n - 1; i <=j;) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                s[pos] = nums[i] * nums[i];
                i++;
            } else {
                s[pos] = nums[j] * nums[j];
                j--;
            }

            --pos;
        }

        return s;
    }
}
