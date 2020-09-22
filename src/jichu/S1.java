package jichu;

/**
 1. 九种基本数据类型的大小，以及他们的封装类。

     八种基本数据类型分别是：int、short、float、double、long、boolean、byte、char void；
     它们的封装类分别是：Integer、Short、Float、Double、Long、Boolean、Byte、Character Void。

 2. Switch能否用string做参数？
    在jdk 7 之前，switch 只能支持 byte、short、char、int 这几个基本数据类型和其对应的封装类型。
    switch后面的括号里面只能放int类型的值，但由于byte，short，char类型，它们会 自动 转换为int类型（精精度小的向大的转化），所以它们也支持。
    jdk1.7后，整形，枚举类型，boolean，字符串都可以。
    其实，jdk1.7并没有新的指令来处理switch string，而是通过调用switch中string.hashCode,将string转换为int从而进行判断。

 3. equals与==的区别。
    java中的数据类型，可分为两类：
    1.基本数据类型，也称原始数据类型。byte,short,char,int,long,float,double,boolean
    他们之间的比较，应用双等号（==）,比较的是他们的值。
    基本数据类型比较(string 除外)， == 和 Equals 两者都是比较值；

    2.复合数据类型(类)
    当他们用（==）进行比较的时候，比较的是他们在内存中的存放地址，所以，除非是同一个new出来的对象，
    他们的比较后的结果为true，否则比较后结果为false。

    JAVA当中所有的类都是继承于Object这个基类的，在Object中的基类中定义了一个equals的方法，
    这个方法的初始行为是比较对象的内存地址， 对于复合数据类型之间进行equals比较，在没有覆写equals方法的情况下，
    他们之间的比较还是基于他们在内存中的存放位置的地址值的

    但在一些类库当中这个方法被覆盖掉了，如String,Integer,Date，在这些类当中equals有其自身的实现，
    而不再是比较类在堆内存中的存放地址了。

    因为Object的equals方法也是用双等号（==）进行比较的，所以比较后的结果跟双等号（==）的结果相同。

     String abc = "abc";
     String abc1 = new String("abc");
     System.out.println((abc == abc1));
     System.out.println(abc.equals(abc1));

 4. Object有哪些公用方法？
     1．clone方法
     保护方法，实现对象的浅复制，只有实现了Cloneable接口才可以调用该方法，否则抛出CloneNotSupportedException异常。

     主要是JAVA里除了8种基本类型传参数是值传递，其他的类对象传参数都是引用传递，
    我们有时候不希望在方法里讲参数改变，这是就需要在类中复写clone方法。

     2．getClass方法
     final方法，获得运行时类型。

     3．toString方法
     该方法用得比较多，一般子类都有覆盖。

     4．finalize方法
     该方法用于释放资源。因为无法确定该方法什么时候被调用，很少使用。

     5．equals方法
     该方法是非常重要的一个方法。一般equals和==是不一样的，但是在Object中两者是一样的。子类一般都要重写这个方法。

     6．hashCode方法
     该方法用于哈希查找，可以减少在查找中使用equals的次数，重写了equals方法一般都要重写hashCode方法。这个方法在一些具有哈希功能的Collection中用到。

     一般必须满足obj1.equals(obj2)==true。可以推出obj1.hashCode()==obj2.hashCode()，但是hashCode相等不一定就满足equals。不过为了提高效率，应该尽量使上面两个条件接近等价。

     如果不重写hashCode(),在HashSet中添加两个equals的对象，会将两个对象都加入进去。

     7．wait方法
     wait方法就是使当前线程等待该对象的锁，当前线程必须是该对象的拥有者，也就是具有该对象的锁。wait()方法一直等待，直到获得锁或者被中断。wait(long timeout)设定一个超时间隔，如果在规定时间内没有获得锁就返回。

     调用该方法后当前线程进入睡眠状态，直到以下事件发生。

     （1）其他线程调用了该对象的notify方法。

     （2）其他线程调用了该对象的notifyAll方法。

     （3）其他线程调用了interrupt中断该线程。

     （4）时间间隔到了。

     此时该线程就可以被调度了，如果是被中断的话就抛出一个InterruptedException异常。

     8．notify方法
     该方法唤醒在该对象上等待的某个线程。

     9．notifyAll方法
     该方法唤醒在该对象上等待的所有线程。

 */
public class S1 {
    public static void main(String[] args) {



    }
}
