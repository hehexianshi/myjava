package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/25 11:38
 * @changeRecord
 */
public class S300 {
    public static void main(String[] args) {
        S300 s300 = new S300();
        int[] nums = new int[]{10,9,2,5,3,7,101,18, 102};
        System.out.println(s300.lengthOfLIS(nums));

    }

    // 动态规划的方法
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {return 0;}

        int[] dp = new int[nums.length];

        // 第一个是1
        dp[0] = 1;
        int maxans = 1;

        for (int i = 1; i < dp.length; i++) {
            int maxval = 0;

            // j永远小于i，
            for (int j = 0; j< i; j++) {
                // 后面大于前面
                if (nums[i] > nums[j]) {
                    maxval = Math.max(maxval, dp[j]);
                }
            }
            // 外层[0, i -1] dp中的最大值， 所以i的最大序列 maxval + 1
            dp[i] = maxval + 1;

            // 记录 从[1 - i]的所有最大值
            maxans = Math.max(maxans, dp[i]);
        }

        return maxans;
    }

    /**
     *
        二分查找  O(n logn)
     */

    public int lengthOfLISS(int[] nums) {
        int[] ints = new int[nums.length];
        int res = 0;

        for (int num : nums) {
            int i = 0, j = res;

            // 二分查找，找到比num大的最小值位置

            while (i < j) {
                int m = (i + j) / 2;
                if (ints[m] < num) {
                    i = m + 1;
                } else {
                    j = m;
                }
            }

            ints[i] = num;
            // j ru
            if (res == j) {
                res++;
            }

        }

        return res;
    }

}
