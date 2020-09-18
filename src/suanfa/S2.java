package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/17 15:22
 * @changeRecord
 */
public class S2 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(2);
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(3);
        listNode.next = listNode1;
        listNode1.next = listNode2;

        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);
        ListNode listNode6 = new ListNode(4);

        listNode4.next = listNode5;
        listNode5.next = listNode6;

        SolutionS2 solution = new SolutionS2();
        ListNode listNode3 = solution.addTwoNumbers(listNode, listNode4);
        while (listNode3 != null) {
            System.out.println(listNode3.val);
            listNode3 = listNode3.next;
        }
    }
}

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {val = x;}
}

class SolutionS2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode headListNode = null;
        ListNode beforeListNode = null;
        int up = 0;
        while (l1 != null || l2 != null) {
            int value = 0;

            if (l1 != null) {
                value = l1.val + value;
            }

            if (l2 != null) {
                value = l2.val + value;
            }

            value = value + up;

            if (value >= 10) {
                value = value - 10;
                up = 1;
            } else {
                up = 0;
            }

            ListNode nowListNode = new ListNode(value);

            if (headListNode == null) {
                headListNode = nowListNode;
            }

            if (beforeListNode != null) {
                beforeListNode.next = nowListNode;
            }

            beforeListNode = nowListNode;

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (up > 0) {
            ListNode nowListNode = new ListNode(up);
            beforeListNode.next = nowListNode;
        }

        return headListNode;
    }
}
