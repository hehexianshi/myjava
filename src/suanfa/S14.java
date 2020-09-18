package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/18 15:51
 * @changeRecord
 */
public class S14 {
    public static void main(String[] args) {
        SolutionS14 solutionS14 = new SolutionS14();
        String[] s = new String[]{"flower","flow","flight"};
        System.out.println(solutionS14.longestCommonPrefix(s));

    }
}


class SolutionS14 {
    public String longestCommonPrefix(String[] strs) {
        String s = "";
        if (strs.length == 0) {
            return s;
        }

        String str = strs[0];
        int length = str.length();

        for (int i = 0; i < length; i++) {
            boolean check = check(str.charAt(i), i, strs);
            if (!check) {
                return s;
            } else {
                s += String.valueOf(str.charAt(i));
            }
        }


        return s;
    }
    
    private boolean check(char s, int index, String[] strs) {
        int length = strs.length;

        for (int i = 0; i < length; i++) {
            String str = strs[i];
            if (str.length() <= index) {
                return false;
            }
            char c = str.charAt(index);
            if (c != s) {
                return false;
            }
        }

        return true;
    }
    
    
}