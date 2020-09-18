package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/17 20:45
 * @changeRecord
 */
public class S8 {

    public static void main(String[] args) {
        SolutionS8 solutionS8 = new SolutionS8();
        String s = "  -0012a42";
        System.out.println(solutionS8.myAtoi(s));

    }
}

/**
 *请你来实现一个 atoi 函数，使其能将字符串转换成整数。
 *
 * 首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。接下来的转化规则如下：
 *
 * 如果第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字字符组合起来，形成一个有符号整数。
 * 假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成一个整数。
 * 该字符串在有效的整数部分之后也可能会存在多余的字符，那么这些字符可以被忽略，它们对函数不应该造成影响。
 * 注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换，即无法进行有效转换。
 *
 * 在任何情况下，若函数不能进行有效的转换时，请返回 0 。
 *
 * 提示：
 *
 * 本题中的空白字符只包括空格字符 ' ' 。
 * 假设我们的环境只能存储 32 位大小的有符号整数，那么其数值范围为 [−231,  231 − 1]。如果数值超过这个范围，请返回  INT_MAX (231 − 1) 或 INT_MIN (−231) 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/string-to-integer-atoi
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class SolutionS8 {
    public int myAtoi(String str) {
        int ant = 0;
        int index = 1;
        boolean first = false;
        boolean kong = true;

        int length = str.length();
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (kong && " ".equals(String.valueOf(c))) {
                continue;
            }

            if (!first && "-".equals(String.valueOf(c))) {
                index = -1;
                first = true;
                kong = false;
                continue;
            }

            if (!first && "+".equals(String.valueOf(c))) {
                first = true;
                kong = false;
                continue;
            }

            if (c < 48 || c > 58) {
                return ant * index;
            }


            if (ant > Integer.MAX_VALUE / 10 || (ant == Integer.MAX_VALUE / 10 && Integer.valueOf(String.valueOf(c)) > 7)) {
                if (index > 0) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }



            ant = ant * 10 + Integer.valueOf(String.valueOf(c));
            kong = false;
            first = true;
        }

        return ant * index;
    }
}
