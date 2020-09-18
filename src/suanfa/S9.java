package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/18 11:19
 * @changeRecord
 */
public class S9 {
    public static void main(String[] args) {
        SolutionS9 solutionS9 = new SolutionS9();
        int x = 876545678;
        System.out.println(solutionS9.isPalindrome(x));

    }
}

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */

class SolutionS9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int cur = 0;
        int num = x;
        while (num != 0) {
            cur = cur * 10 + num % 10;
            num /= 10;
        }

        return cur == x;
    }
}


