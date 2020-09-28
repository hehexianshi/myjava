package suanfa;

import java.util.Arrays;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/25 15:04
 * @changeRecord
 */
public class S322 {

    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        // 将所有的数据填充为amount + 1
        Arrays.fill(dp, max);

        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                // 判断金额是否大于coins中的面值
                if (coins[j] <= i) {
                    // 总值 - 面值 获取到dp中上次的数，然后再加1
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }

        // 判断如果大于amount, 就是没有找到值
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        S322 s322 = new S322();
        int[] ints = {2};
        int amount = 4;
        System.out.println(s322.coinChange(ints, amount));

    }
}
