package suanfa;

import com.sun.tools.javac.util.StringUtils;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 学而思思维
 * @mobile 18611693075
 * @created 2021/08/31 10:49
 * @changeRecord
 */
public class S557 {

    /**
     * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
     * @param args
     */

    public static void main(String[] args) {
        S557 s557 = new S557();

        String s = "Let's take LeetCode contest";
        System.out.println(s557.reverseWords(s));

    }

    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        for (int length = 0; length < s1.length; length++) {
            s1[length] = reverse(s1[length]);
        }



        return String.join(" ", s1);
    }


    public String reverse(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return String.valueOf(chars);
    }


}
