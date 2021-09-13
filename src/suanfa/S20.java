package suanfa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/21 16:56
 * @changeRecord
 */
public class S20 {
    public static void main(String[] args) {

        String s = "{[ ]}";
        S20 solutionS20 = new S20();
        System.out.println(solutionS20.isValid(s));
    }

    public boolean isValid(String s) {
        HashMap<Character, Character> chars = new HashMap<>();
        chars.put(')', '(');
        chars.put('}', '{');
        chars.put(']', '[');

        int length = s.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (" ".equals(String.valueOf(c))) {
                continue;
            }

            if (!stack.isEmpty() && stack.peek().equals(chars.get(c))) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

