package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 学而思思维
 * @mobile 18611693075
 * @created 2021/08/31 11:07
 * @changeRecord
 */
public class S876 {

    /**
     * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
     *
     * 如果有两个中间结点，则返回第二个中间结点。
     *
     * 1,2,3,4,5
     * @param args
     */
    public static void main(String[] args) {

        S876 s876 = new S876();
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);

        s876.middleNode(listNode);

    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null) {

            fast = fast.next;
            if (fast == null) {
                break;
            }
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
}
