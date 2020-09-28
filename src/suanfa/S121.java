package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/24 15:39
 * @changeRecord
 */
public class S121 {

    public static void main(String[] args) {

        S121 s121 = new S121();
        int[] n = new int[]{7,1,5,3,6,4,100,102};
        System.out.println(s121.maxProfit(n));

    }

    /**
     * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
     *
     * 如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
     *
     * 注意：你不能在买入股票前卖出股票。
     *
     *  
     *
     * 示例 1:
     *
     * 输入: [7,1,5,3,6,4]
     * 输出: 5
     * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {return 0;}

        int length = prices.length;
        int[][] dp = new int[length][3];

        int res = 0;

        // 没有股票
        dp[0][0] = 0;
        // 持有股票（今天买，或者之前买）
        dp[0][1] -= prices[0];
        // 卖出股票
        dp[0][2] = 0;

        for (int i = 1; i < length; i++) {
            // 没有股票 = 前一天没有
            dp[i][0] = dp[i - 1][0];

            // 买入股票  = 前一天买入股票，或者当天买入股票的最大值 (因为只能买一次，所以上次只能是已经过买过或者，没有买过)
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);

            // 卖出股票 = 前一天持有股票 + 当天价格
            dp[i][2] = dp[i - 1][1] + prices[i];

            // 买入股票肯定小于没有或者卖出
            // 所以只判断 没有和卖出的大小

            // 当最后一天时，就判断 不操作多还是卖出后多
            if (dp[i][0] > dp[i][2]) {
                res = Math.max(res, dp[i][0]);
            } else {
                res = Math.max(res, dp[i][2]);
            }
        }

        return res;
    }

}
