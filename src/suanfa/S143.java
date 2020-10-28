package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/28 16:28
 * @changeRecord
 */
public class S143 {
    /**
     * 给定一个单链表 L：L0→L1→…→Ln-1→Ln ，
     * 将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…
     *
     * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/reorder-list
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

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


    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode tail = head.next;
        ListNode pre = head.next;
        while (head != null) {

            // 将tail指向最后一位
            while (tail.next != null) {
                pre = tail;
                tail = tail.next;
            }

            // 交换
            tail.next = head.next;
            head.next = tail;
            pre.next = null;

            // head 位移

            if (head.next == null) {
                return;
            }

            head = head.next.next;
        }

    }

    public static void main(String[] args) {
        S143 s143 = new S143();
        s143.run();
    }

    private void run() {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(5);

        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        //listNode3.next = listNode4;

        reorderList(listNode);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
