package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/17 20:24
 * @changeRecord
 */
public class S7 {
    public static void main(String[] args) {
        SolutionS7 solutionS7 = new SolutionS7();
        int x = 1231235151;
        System.out.println(solutionS7.reverse(x));

    }
}

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。
 * 请根据这个假设，如果反转后整数溢出那么就返回 0。
 */

class SolutionS7 {
    public int reverse(int x) {

        int ans = 0;

        while (x != 0) {
            int pop = x % 10;

            // 2147483647
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }

            // -2147483648
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            ans = ans * 10 + pop;
            x /= 10;
        }

        return ans;
    }
}
