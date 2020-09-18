package suanfa;

import java.util.HashSet;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/17 16:03
 * @changeRecord
 */
public class S3 {
    public static void main(String[] args) {

        SolutionS3 solutionS3 = new SolutionS3();
        String s = "a";
        System.out.println(solutionS3.lengthOfLongestSubstring(s));

    }


}

/**
 * 滑动窗口, 左指针删除数据， 右指针增加数据，判断数据存量最大值。
 */

class SolutionS3 {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();

        HashSet<Character> characterHashSet = new HashSet<>();

        int rk = -1;
        int ans = 0;

        for (int i = 0; i < length; i++) {
            if (i != 0) {
                characterHashSet.remove(s.charAt(i - 1));
            }

            while (rk + 1 < length && !characterHashSet.contains(s.charAt(rk + 1))) {
                characterHashSet.add(s.charAt(rk + 1));
                rk++;
            }

            ans = Math.max(ans, rk - i + 1);
        }

        return ans;
    }
}
