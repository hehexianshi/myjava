package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/27 20:08
 * @changeRecord
 */

public class S147 {

    public ListNode insertionSortList(ListNode head) {
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
                // 从头遍历连表， 到pre 结束（p.next != cur）,  等于说吧cur位置的节点，放在head - cur 之前符合的位置，
                while (p.next.val < cur.val && p.next != cur) {
                    p = p.next;
                }

                // 交换数据
                /**
                 *      p                 pre     cur
                 *      |
                 *      |
                 *   listNode      1       4       2       3
                 *                 |                       |
                 *                 |                       |
                 *                 p(新的p位置)           cur(交换完之后的位置)
                 *
                 *    p.next.val = 4  so p.next.val > cur.val (跳出循环)
                 *
                 *
                 *   // cur 交换 至 p 之后，pre.next 之前
                 *   pre.next = cur.next
                 *   cur.next = p.next
                 *   p.next = cur;
                 *
                 *   // 设置新的cur位置为pre.next  3这个位置
                 *   cur = pre.next
                 *
                 *
                 */
                pre.next = cur.next;
                cur.next = p.next;
                p.next = cur;
                cur = pre.next;
            }
        }

        return listNode.next;
    }

    public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }


    /**
     * 插入排序的动画演示如上。从第一个元素开始，该链表可以被认为已经部分排序（用黑色表示）。
     * 每次迭代时，从输入数据中移除一个元素（用红色表示），并原地将其插入到已排好序的链表中。
     *
     *  
     *
     * 插入排序算法：
     *
     * 插入排序是迭代的，每次只移动一个元素，直到所有元素可以形成一个有序的输出列表。
     * 每次迭代中，插入排序只从输入数据中移除一个待排序的元素，找到它在序列中适当的位置，并将其插入。
     * 重复直到所有输入数据插入完为止。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/insertion-sort-list
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String[] args) {
        S147 s147 = new S147();
        s147.run();
    }

    public void run() {
        ListNode listNode = new ListNode(4);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(3);

        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode listNode4 = this.insertionSortList(listNode);

        while (listNode4 != null) {
            System.out.println(listNode4.val);
            listNode4 = listNode4.next;
        }
    }
}
