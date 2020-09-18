package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/18 12:39
 * @changeRecord
 */
public class S11 {

    public static void main(String[] args) {
        SolutionS11 solutionS11 = new SolutionS11();
        int[] s = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(solutionS11.maxArea(s));
    }
}

class SolutionS11 {
    public int maxArea(int[] height) {

        int max1 = 0;

        int length = height.length;

        for (int i = 0; i < length; i++) {
            for (int j = length -1; j > i; j--) {
                int max = Math.min(height[i], height[j]) * (j - i);
                max1 = Math.max(max, max1);
            }
        }

        return max1;
    }
}

class SolutionS11T {
    public int maxArea(int[] height) {

        int res = 0;
        int i = 0;
        int j = height.length - 1;

        // 区域重叠，数据为0
        while (i < j) {
            int area = Math.min(height[i], height[j]) * (j - i);
            res = Math.max(area, res);

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return res;
    }
}
