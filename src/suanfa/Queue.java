package suanfa;

import java.util.PriorityQueue;
import java.util.function.IntFunction;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/02/10 10:59
 * @changeRecord
 */
public class Queue {
    final PriorityQueue<Integer> q;

    final int k;

    public Queue(int k, int[] a) {
        this.k = k;
        q = new PriorityQueue<>(k);
        for (int n : a) {
            add(n);
        }
    }

    public int get() {
        return q.poll();
    }

    public int add(int n) {
        if (q == null) {
            return 0;
        }

        try {
            if (q.size() < k) {
                q.offer(n);
            } else if (q.peek() < n) {
                q.poll();
                q.offer(n);
            }

            return q.peek();
        } catch (Exception e) {
            return 0;
        }
    }



    public static void main(String[] args) {
        int[] ints = {100, 200};
        Queue queue = new Queue(100, ints);

        queue.add(300);
        queue.add(400);
        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());

        IntFunction<Integer> f3 = a -> 100;

        System.out.println(f3.apply(300));
    }


}
