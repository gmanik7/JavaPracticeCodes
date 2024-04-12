package Threads;
class Counter{
    int count;

    /**
     * if we make method synchronized, then only one thread will access same method at a time.
     */


    public synchronized void increment(){
        count++;
    }
}
public class SyncDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
       // c.increment();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0;i<1000;i++){
                    c.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0;i<1000;i++){
                    c.increment();
                }
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("count "+c.count);
    }
}
