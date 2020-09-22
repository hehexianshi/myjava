package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/21 17:14
 * @changeRecord
 */
public class S21 {

    public static void main(String[] args) {
        S21 s21 = new S21();
        s21.run();
    }

    private void run() {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(1);
        ListNode listNode4 = new ListNode(3);
        ListNode listNode5 = new ListNode(4);

        listNode.next = listNode1;
        listNode1.next = listNode2;

        listNode3.next = listNode4;
        listNode4.next = listNode5;

        solution.mergeTwoLists(listNode, listNode3);

    }


    class Solution {
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
}



