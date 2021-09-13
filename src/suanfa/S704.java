package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 学而思思维
 * @mobile 18611693075
 * @created 2021/08/30 15:48
 * @changeRecord
 */
public class S704 {
    public static void main(String[] args) {
        /**
         *
         * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
         * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
         *
         * 来源：力扣（LeetCode）
         * 链接：https://leetcode-cn.com/problems/binary-search
         * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
         */
        S704 solutionS704 = new S704();
        int[] ints = {-1, 0, 3, 5, 9, 12};
        System.out.println(solutionS704.search(ints, 9));

    }

    public int search(int[] nums, int target) {
        int p, left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            p = left + ( right - left ) / 2;
            if (nums[p] == target) return p;
            if (nums[p] > target) right = p - 1;
            else left = p + 1;
        }

        return -1;
    }
}
