package jichu;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/09/18 20:38
 * @changeRecord
 */
public class Notify {
    public static void main(String[] args) {
        NotifyMethod notifyMethod = new NotifyMethod();

        Thread t1 = new Thread(() -> {
            try {
                notifyMethod.product();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }, "t1");



        Thread t2 = new Thread(() -> {
            try {
                notifyMethod.customer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "t2");



        Thread t3 = new Thread(() -> {
            try {
                notifyMethod.customer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "t3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class NotifyMethod {

    private final int MAX_COUNT = 100;

    int product = 0;

    public synchronized void product() throws InterruptedException {
        while (true) {
            System.out.println(Thread.currentThread().getName() + ":::run:::" + product);
            Thread.sleep(10);
            if (product >= MAX_COUNT) {
                System.out.println("满了");
                wait();
            } else {
                product++;
            }

            notifyAll();
        }
    }

    public synchronized void customer() throws InterruptedException {
        while (true) {
            System.out.println(Thread.currentThread().getName() + ":::run:::" + product);
            Thread.sleep(10);
            if (product <= 0) {
                System.out.println("空了");
                wait();
            } else {
                product--;
            }

            notifyAll();
        }
    }
}
