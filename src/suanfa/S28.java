package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/22 14:47
 * @changeRecord
 */
public class S28 {
    /**
     *
     给定一个 haystack 字符串和一个 needle 字符串，
     在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

     来源：力扣（LeetCode）
     链接：https://leetcode-cn.com/problems/implement-strstr
     著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static void main(String[] args) {
        S28 s28 = new S28();
        System.out.println(s28.strStr("mississippi", "issip"));
    }

    public int strStr(String haystack, String needle) {
        if (needle == "") {
            return 0;
        }
        KMP(needle);
        return search(haystack);
    }

    private int[][] dp;
    private String pat;

    public void KMP(String pat) {
        this.pat = pat;
        int M = pat.length();

        dp = new int[M][256];

        dp[0][pat.charAt(0)] = 1;

        int X = 0;

        for (int i = 0; i < M; i++) {
            for (int c = 0; c < 256; c++) {
                if (pat.charAt(i) == c) {
                    dp[i][pat.charAt(i)] = i + 1;
                } else {
                    dp[i][c] = dp[X][c];
                }
            }

            X = dp[X][pat.charAt(i)];
        }
    }

    public int search(String txt) {
        int M = pat.length();
        int N = txt.length();

        int j = 0;

        for (int i = 0; i < N; i++) {
            j = dp[j][txt.charAt(i)];
            if (j == M) {
                return i - M + 1;
            }
        }

        return -1;
    }


}
