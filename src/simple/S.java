package simple;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/24 18:22
 * @changeRecord
 */
public class S {

    public static void main(String[] args) {
        S t = new S();
        int[] s = new int[]{1,4,5,6,3};
        System.out.println(t.same(s));

    }

    public boolean same(int[] s) {

        Arrays.sort(s);
        int length = s.length;
        for (int i = 1; i < length; i++) {
            if (s[i] == s[i-1]) {
                return true;
            }
        }

        return false;
    }

}
