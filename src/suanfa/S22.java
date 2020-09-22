package suanfa;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/21 17:41
 * @changeRecord
 */
public class S22 {

    public static void main(String[] args) {
        SolutionS22 solutionS22 = new SolutionS22();
        System.out.println(solutionS22.generateParenthesis(4));

    }
}

/**
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 *
 *  
 *
 * 示例：
 *
 * 输入：n = 3
 * 输出：[
 *        "((()))",
 *        "(()())",
 *        "(())()",
 *        "()(())",
 *        "()()()"
 *      ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/generate-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


class SolutionS22 {
    List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtrack(0, 0, n, "");
        return ans;
    }

    public void backtrack(int left, int right, int n, String path) {
        // 剪树叶，left 超过n，括号不成立
        // right 比left 还多，括号不成立
        if (left > n || left < right) {
            return;
        }

        // 如果总数相等，直接结束
        if (left + right == 2 * n) {
            ans.add(path);
            return;
        }

        // 回溯
        backtrack(left + 1, right, n, path + "(");
        backtrack(left, right + 1, n, path + ")");

    }
}
