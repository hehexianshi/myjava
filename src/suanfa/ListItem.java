package suanfa;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/04/09 18:23
 * @changeRecord
 */

public class ListItem {

    ListItem next;
    Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public ListItem getNext() {
        return next;
    }

    public void setNext(ListItem next) {
        this.next = next;
    }
}

class test {
    public static void main(String[] args) {
        ListItem a = new ListItem();
        a.value = 5;

        ListItem b = new ListItem();
        b.value = 3;
        b.next = a;

        ListItem c = new ListItem();
        c.value = 1;
        c.next = b;


        ListItem d = new ListItem();
        d.value = 6;

        ListItem e = new ListItem();
        e.value = 4;
        e.next = a;

        ListItem f = new ListItem();
        f.value = 2;
        f.next = b;

        merge(c.next, f);

        while (c != null) {
            System.out.println(c.value);
            c = c.next;

        }
    }

    public static void merge(ListItem a, ListItem b) {

        if (a == null) return ;
        if (b == null) return ;

        ListItem bNext = b.next;
        ListItem aNext = a.next;

        if (a.value > b.value) {
            b.next = a;
            a.next = bNext;
        }

        //merge(a.next, b.next);

    }
}
