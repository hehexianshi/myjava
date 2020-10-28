package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/21 20:47
 * @changeRecord
 */
public class S25 {
    /**
     * 按照k个节点 反转连表
     * @param args
     */

    public static void main(String[] args) {

        S25 s25 = new S25();
        s25.test();
    }

    private void test() {
        Solution solution = new Solution();

        S25.ListNode listNode = new S25.ListNode(1);
        S25.ListNode listNode1 = new S25.ListNode(2);
        S25.ListNode listNode2 = new S25.ListNode(3);
        S25.ListNode listNode3 = new S25.ListNode(4);
        S25.ListNode listNode4 = new S25.ListNode(5);


        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        solution.reverseKGroup(listNode, 3);

    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            ListNode tail = head;
            // 取k个节点，如果节点小于k 返回
            for (int i = 0; i < k; i++) {
               if (tail == null) {
                   return head;
               }

               tail = tail.next;
            }

            ListNode newHead = reverse(head, tail);

            /**
             *  1, 2, 3, 4 反转之后 是 4，3，2，1 head = 1, head.next 继续拼接 新反转 的数据
             */
            head.next = reverseKGroup(tail, k);
            return newHead;
        }

        private ListNode reverse(ListNode head, ListNode tail) {
            ListNode pre = null;
            ListNode next = null;

            while (head != tail) {
                // 获取下一个节点
                next = head.next;

                // next节点转换
                head.next = pre;
                pre = head;

                // head 指向下一个节点
                head = next;
            }

            return pre;
        }
    }
}
