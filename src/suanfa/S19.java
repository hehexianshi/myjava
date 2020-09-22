package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/21 16:17
 * @changeRecord
 */
public class S19 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        //ListNode listNode1 = new ListNode(2);
        //ListNode listNode2 = new ListNode(3);
        //ListNode listNode3 = new ListNode(4);
        //ListNode listNode4 = new ListNode(5);
        //listNode.next = listNode1;
        //listNode1.next = listNode2;
        //listNode2.next = listNode3;
        //listNode3.next = listNode4;

        SolutionS19 solutionS19 = new SolutionS19();
        solutionS19.removeNthFromEnd(listNode, 1);
    }
}

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 */

class SolutionS19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode slow = pre;
        ListNode fast = pre;

        while (n != 0) {
            fast = fast.next;
            n--;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return pre.next;
    }
}
