package suanfa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 学而思思维
 * @mobile 18611693075
 * @created 2021/08/31 15:32
 * @changeRecord
 */
public class S139 {
    /**
     * 给定一个非空字符串 s 和一个包含非空单词的列表 wordDict，
     * 判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
     *
     * 说明：
     *
     * 拆分时可以重复使用字典中的单词。
     * 你可以假设字典中没有重复的单词。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/word-break
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */

    public static void main(String[] args) {
        S139 s139 = new S139();

        List<String> s = new ArrayList<>();
        s.add("leet");
        s.add("code");
        System.out.println(s139.wordBreak("leetcode", s));

    }

    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> wordSet = new HashSet<>(wordDict);

        boolean[] booleans = new boolean[s.length() + 1];
        booleans[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (booleans[j] && wordSet.contains(s.substring(j, i))) {
                    booleans[i] = true;
                    break;
                }

            }
        }

        return booleans[s.length()];

    }
}
