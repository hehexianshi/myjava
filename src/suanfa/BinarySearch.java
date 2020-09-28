package suanfa;

import java.util.Arrays;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/25 12:52
 * @changeRecord
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] ints = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};

        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(ints, 9));

    }

    public int search(int[] nums, int k) {
        Arrays.sort(nums);
        int j = 0;
        int i = 0;

        int length = nums.length;

        while (i < length) {
            int m = (length + i) / 2;
            if (nums[m] > k) {
                length = m;
            } else if (nums[m] < k) {
                i = m;
            } else {
                return m;
            }
        }

        return  -1;
    }
}
