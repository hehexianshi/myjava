package suanfa;

import java.awt.*;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/21 18:09
 * @changeRecord
 */
public class S23 {
    public static void main(String[] args) {
        S23 s23 = new S23();
        s23.run();

    }

    private void run() {
        Solution solution = new Solution();
        ListNode[] node = new ListNode[]{};
        System.out.println(solution.mergeKLists(node));


    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * 给你一个链表数组，每个链表都已经按升序排列。
     * <p>
     * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
     * <p>
     *  
     * <p>
     * 示例 1：
     * <p>
     * 输入：lists = [[1,4,5],[1,3,4],[2,6]]
     * 输出：[1,1,2,3,4,4,5,6]
     * 解释：链表数组如下：
     * [
     * 1->4->5,
     * 1->3->4,
     * 2->6
     * ]
     * 将它们合并到一个有序链表中得到。
     * 1->1->2->3->4->4->5->6
     * 示例 2：
     * <p>
     * 输入：lists = []
     * 输出：[]
     * 示例 3：
     * <p>
     * 输入：lists = [[]]
     * 输出：[]
     *  
     * <p>
     * 提示：
     * <p>
     * k == lists.length
     * 0 <= k <= 10^4
     * 0 <= lists[i].length <= 500
     * -10^4 <= lists[i][j] <= 10^4
     * lists[i] 按 升序 排列
     * lists[i].length 的总和不超过 10^4
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/merge-k-sorted-lists
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            int length = lists.length;
            if (length < 1) {
                return null;
            }
            ListNode first = lists[0];
            if (length < 2) {
                return mergeTwoLists(first, null);
            }

            for (int i = 1; i < length; i++) {
                first = mergeTwoLists(first, lists[i]);
            }

            return first;
        }

        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null) {
                return l2;
            }

            if (l2 == null) {
                return l1;
            }

            if (l1.val < l2.val) {
                l1.next = mergeTwoLists(l1.next, l2);
                return l1;
            } else {
                l2.next = mergeTwoLists(l1, l2.next);
                return l2;
            }
        }
    }
}
