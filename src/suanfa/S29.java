package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/23 12:52
 * @changeRecord
 */
public class S29 {

    public static void main(String[] args) {

        S29 s29 = new S29();
        System.out.println(s29.divide(7, -3));

    }

    public int divide(int dividend, int divisor) {
        int i = 0;

        if (divisor > 0) {
            while (dividend > divisor) {
                dividend -= divisor;
                i++;

            }
        } else {
            while (dividend < divisor) {
                dividend += divisor;
                i--;

            }
        }

        return i;
    }
}
