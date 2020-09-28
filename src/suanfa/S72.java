package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/27 10:59
 * @changeRecord
 */
public class S72 {
    public int minDistance(String word1, String word2) {
        int M = word1.length();
        int N = word2.length();

        // 如果有一个为0 ，或者全为0 的情况，就需要 M + N 次变化
        if (M * N == 0) {
            return M + N;
        }

        // 设置从1- M + 1 总长度为M 的dp
        int[][] dp = new int[M + 1][N + 1];

        // 如果N 为0, dp长度为 M 的长度
        for (int i = 0; i < M + 1; i++) {
            dp[i][0] = i;
        }

        // 如果M 为0， dp长度为N的长度
        for (int i = 0; i < N + 1; i++) {
            dp[0][i] = i;
        }

        // 遍历总体长度，最后dp[M][N]的就是需要变化的次数
        for (int i = 1; i < M + 1; i++) {
            for (int i1 = 1; i1 < N + 1; i1++) {
                // M - 1 长度的变换 + 本次变换 , word1 变
                int left = dp[i - 1][i1] + 1;

                // N - 1 长度的变换 + 本次变换, word2 变
                int down = dp[i][i1 - 1] + 1;

                // M - 1 ，N - 1的变换
                int leftDown = dp[i - 1][i1 - 1];

                // 如果两个相等， 则不需要 + 1， 如果不想等，M位 变成N位 或N位 变成 M位， 只需要一次， +1
                if (word1.charAt(i - 1) != word2.charAt(i1 - 1)) {
                    leftDown += 1;
                }

                // 获取到，前面最小的变换次数
                dp[i][i1] = Math.min(left, Math.min(down, leftDown));
            }
        }


        return dp[M][N];
    }

    /**
     * 给你两个单词 word1 和 word2，请你计算出将 word1 转换成 word2 所使用的最少操作数 。
     *
     * 你可以对一个单词进行如下三种操作：
     *
     * 插入一个字符
     * 删除一个字符
     * 替换一个字符
     *  
     *
     * 示例 1：
     *
     * 输入：word1 = "horse", word2 = "ros"
     * 输出：3
     * 解释：
     * horse -> rorse (将 'h' 替换为 'r')
     * rorse -> rose (删除 'r')
     * rose -> ros (删除 'e')
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/edit-distance
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */

    public static void main(String[] args) {
        S72 s72 = new S72();
        String word1 = "101010101010101010101010";
        String word2 = "101011101010101010101010";
        System.out.println(s72.minDistance(word1, word2));

    }
}
