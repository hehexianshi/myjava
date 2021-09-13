package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 学而思思维
 * @mobile 18611693075
 * @created 2021/08/31 14:24
 * @changeRecord
 */
public class S1137 {

    /**
     * 泰波那契序列 Tn 定义如下： 
     *
     * T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
     *
     * 给你整数 n，请返回第 n 个泰波那契数 Tn 的值。
     *
     *  
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/n-th-tribonacci-number
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String[] args) {
        S1137 s1137 = new S1137();
        System.out.println(s1137.tribonacci(35));

    }

    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;

        int p = 0;int q = 0; int r = 1;int s = 1;

        for (int i = 3; i <= n; i++) {
            p = q;
            q = r;
            r = s;
            s = p + q + r;
        }

        return s;
    }
}
