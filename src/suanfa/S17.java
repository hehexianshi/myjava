package suanfa;

import java.util.*;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/21 14:44
 * @changeRecord
 */
public class S17 {
    public static void main(String[] args) {
        S17 solutionS17 = new S17();
        String s = "23";
        System.out.println(solutionS17.letterCombinations(s));
    }

    public List<String> letterCombinations(String digits) {
        Map<Integer, List<String>> s = new HashMap<>(16);
        List<String> str = new ArrayList<>();

        s.put(1, new ArrayList<>());
        s.put(2, Arrays.asList("a", "b", "c"));
        s.put(3, Arrays.asList("d", "e", "f"));
        s.put(4, Arrays.asList("g", "h", "i"));
        s.put(5, Arrays.asList("j", "k", "l"));
        s.put(6, Arrays.asList("m", "n", "o"));
        s.put(7, Arrays.asList("p", "q", "r", "s"));
        s.put(8, Arrays.asList("t", "u", "v"));
        s.put(9, Arrays.asList("w", "x", "y", "z"));

        int length = digits.length();
        for (int i = 0; i < length; i++) {

            Integer integer = Integer.valueOf(String.valueOf(digits.charAt(i)));
            List<String> strings = s.get(integer);
            str = repeat(str, strings);
        }

        return str;

    }

    private List<String> repeat(List<String> str, List<String> strings) {

        if (str.isEmpty()) {
            return strings;
        }

        List<String> newStr = new ArrayList<>();
        int size = strings.size();
        for (int i1 = 0; i1 < str.size(); i1++) {
            for (int i = 0; i < size; i++) {
                newStr.add(str.get(i1) + strings.get(i));
            }

        }

        return newStr;
    }
}
