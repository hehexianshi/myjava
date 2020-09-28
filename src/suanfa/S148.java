package suanfa;

import java.util.List;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/28 11:21
 * @changeRecord
 */
public class S148 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode listNode = new ListNode(0);
        listNode.next = head;

        ListNode pre = head;
        ListNode cur = head.next;

        while (cur != null) {
            if (pre.val <= cur.val) {
                pre = cur;
                cur = cur.next;
            } else {
                ListNode p = listNode;

                while (p.next.val < cur.val) {
                    p = p.next;
                }

                pre.next = cur.next;
                cur.next = p.next;
                p.next = cur;

                cur = pre.next;
            }
        }

        return listNode.next;
    }

    public static void main(String[] args) {
        S148 s148 = new S148();
        s148.run();
        
    }

    public void run() {

        ListNode listNode = new ListNode(4);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(3);

        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode s = sortList(listNode);

    }
}
