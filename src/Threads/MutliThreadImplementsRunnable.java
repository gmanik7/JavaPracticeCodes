package Threads;

public class MutliThreadImplementsRunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 0;i<3;i++){
            System.out.println(i + " Hi");
        }
    }

    public static void main(String[] args) {


        MutliThreadImplementsRunnable thread = new MutliThreadImplementsRunnable();
        Thread t1 = new Thread(thread);
        t1.start();
    }



}
