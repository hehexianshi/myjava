package suanfa;

import java.util.LinkedList;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 学而思思维
 * @mobile 18611693075
 * @created 2021/08/31 18:12
 * @changeRecord
 */
public class S32 {

    public int longestValidParentheses(String s) {
        LinkedList<Integer> t = new LinkedList<>();

        // 插入底层数据值，为index 开始位置，为了计算长度。
        t.push(-1);
        int max = 0;

        for (int length = 0; length < s.length(); length++) {
            if (s.charAt(length) == '(') {
                t.push(length);
            } else {
                t.pop();
                if (t.isEmpty()) {
                    // 如果为空，是)括号比(多导致的，所以index位置就为当前位置。
                    t.push(length);
                } else {

                    // 计算stack里的index与实际位置的差值，为当前位置最大字串长度
                    max = Math.max(max, length - t.peek());
                }
            }
        }

        return max;

    }

    public static void main(String[] args) {
        S32 s32 = new S32();
        System.out.println(s32.longestValidParentheses("()()()()()"));
    }
}
