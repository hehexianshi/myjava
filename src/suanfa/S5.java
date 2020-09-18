package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/17 17:39
 * @changeRecord
 */
public class S5 {

    public static void main(String[] args) {
        SolutionS5 solutionS5 = new SolutionS5();
        String s = "";
        System.out.println(s.substring(1, 2));
        System.out.println(solutionS5.longestPalindrome(s));
    }
}


class SolutionS5 {
    public String longestPalindrome(String s) {

        if ("".equals(s) || s.length() == 1) {
            return s;
        }
        int length = s.length();

        int start = 0;
        int end = 0;

        for (int i = 0; i < length; i++) {
            // 奇数
            int len1 = expandAround(s, i, i);
            // 偶数
            int len2 = expandAround(s, i, i+1);

            int max = Math.max(len1, len2);
            if (max > end - start) {
                // （max - 1 ）/ 2 为了规避奇偶 问题
                start = i - (max - 1) / 2;
                end = i + max / 2;
            }
        }

        // end = index
        return s.substring(start, end + 1);
    }

    private int expandAround(String s, int left ,int right) {
        // 先加减，然后判断
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}
