package suanfa;

import java.lang.reflect.Array;
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
 * @created 2020/09/23 20:59
 * @changeRecord
 */
public class S120 {

    public static void main(String[] args) {
        List<List<Integer>> s = new ArrayList<>();
        s.add(Arrays.asList(2));
        s.add(Arrays.asList(3, 4));
        s.add(Arrays.asList(6, 5, 7));
        s.add(Arrays.asList(4, 1, 8, 3));

        S120 s120 = new S120();
        System.out.println(s120.minimumTotal(s));
    }

    /**
     * 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
     *
     * 相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。
     *
     *  
     *
     * 例如，给定三角形：
     *
     * [
     *      [2],
     *     [3,4],
     *    [6,5,7],
     *   [4,1,8,3]
     * ]
     * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/triangle
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param triangle
     * @return
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        int[][] dp = new int[size][size];

        // 从底往顶累加
        List<Integer> line = triangle.get(size - 1);


        // 所以dp的最后一行就是 triangle 的最后一行
        for (int i = 0; i < line.size(); i++) {
            dp[size - 1][i] = line.get(i);
        }

        // 完成dp的所有操作 设定M = 4
        // 上面已经完成了 dp的最大一层数据 M 层 J 位置
        // 那 M 层  == min(dp[M + 1][J], dp[M + 1][J + 1]) + 当前位置的值(triangle[M][J])
        // 当所有的路径走完，dp[0][0], 就是最小值，因为
        //
        // dp[0][0] = min(dp[1][0], dp[1][1]) + triangle[0][0]

        // 而 dp[1][0] = min(dp[2][0], dp[2][1]) + triangle[1][0]
        // 而 dp[1][1] = min(dp[2][1], dp[2][2]) + triangle[1][1]

        // 而 dp[2][0] = min(dp[3][0], dp[3][1]) + triangle[2][0]
        // 而 dp[2][1] = min(dp[3][1], dp[3][2]) + triangle[2][1]
        // 而 dp[2][2] = min(dp[3][2], dp[3][3]) + triangle[2][2]

        // 而 dp[3][0] = triangle[3][0]
        // 而 dp[3][1] = triangle[3][1]
        // 而 dp[3][2] = triangle[3][2]
        // 而 dp[3][3] = triangle[3][3]

        // 因为dp[3] 是最后一层，我们在上面已经定义了 dp[size - 1][i] = line.get(i)

        for (int i = size - 2; i >= 0; i--) {
            for (int j = 0; j < i + 1; j++) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }

        return dp[0][0];


    }
}
