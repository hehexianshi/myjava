package suanfa;

import java.util.List;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/21 19:19
 * @changeRecord
 */
public class S24 {
    public static void main(String[] args) {
        S24 s24 = new S24();
        s24.run();

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private void run() {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);

        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        solution.swapPairs(listNode);

    }

    class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ListNode next = head.next;
            head.next = swapPairs(next.next);

            next.next = head;
            return next;
        }
    }
}


