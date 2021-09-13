package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 学而思思维
 * @mobile 18611693075
 * @created 2021/09/01 16:58
 * @changeRecord
 */
public class S567 {
    public boolean checkInclusion(String s1, String s2) {
        int length = s2.length() - s1.length();

        while (length >= 0) {


            if (has(s1, s2.substring(length, length + s1.length()))) {
                return true;
            }
            length--;
        }

        return false;
    }

    public boolean has(String s1, String s2) {
        int j = s1.length() - 1;

        while (j >= 0) {

            s2 = s2.replaceFirst(String.valueOf(s1.charAt(j)), "");
            j--;
        }

        return s2.isEmpty();
    }

    /**
     * 给你两个字符串 s1 和 s2 ，写一个函数来判断 s2 是否包含 s1 的排列。
     *
     * 换句话说，s1 的排列之一是 s2 的 子串 。
     */

    public static void main(String[] args) {
        S567 s567 = new S567();
        System.out.println(s567.checkInclusion("hello", "ooolleoooleh"));

    }
}


