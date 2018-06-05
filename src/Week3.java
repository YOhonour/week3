public class Week3 {
    public static void main(String[] args) {
        Demo d1 = new Demo("d1");
        Demo d2 = new Demo("d2");
        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d1);
        Thread t3 = new Thread(d2);
        Thread t4 = new Thread(d2);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
