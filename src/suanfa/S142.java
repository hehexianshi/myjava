package suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/28 15:37
 * @changeRecord
 */
public class S142 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     *
     *  另外一种解题思路
     *  1. 从head 到 环的开始位置设置为 F
     *  2. 从环的开始位置 到 相遇位置 设为 A
     *  3. 从相遇位置 到 环的开始位置 设为 B
     *  4. 快慢指针是2, 1的情况，所以快指针会套圈慢指针， 且为 1圈
     *
     *  得出 2 (F + A) = F + A + B + A      -------> F = b
     *
     *  所以从head，b 同时移动， 相遇即为圈的开始位置
     *
     * @param head
     * @return
     */

    public ListNode detectCycle(ListNode head) {
        List<ListNode> listNodes = new ArrayList<>();

        while (head != null) {
            if (listNodes.contains(head)) {
                return head;
            }

            listNodes.add(head);
            head = head.next;
        }

        return null;
    }

    public static void main(String[] args) {
        S142 s142 = new S142();
        s142.run();
    }

    public void run() {
        ListNode listNode = new ListNode(3);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(0);
        ListNode listNode3 = new ListNode(4);

        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode1;

        this.detectCycle(listNode);

    }
}
