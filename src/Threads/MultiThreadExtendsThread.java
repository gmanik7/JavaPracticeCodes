package Threads;

public class MultiThreadExtendsThread extends Thread
{
    @Override
    public void run() {
        for(int i = 0;i<3;i++){
            try{
                System.out.println(i + " Hi");
                Thread.sleep(200);   //sleep method
            }
            catch(Exception e){
                System.out.println(e);
            }

        }
    }

    public static void main(String[] args) {
        MultiThreadExtendsThread thread = new MultiThreadExtendsThread();
        MultiThreadExtendsThread thread1 = new MultiThreadExtendsThread();

        thread.start();
        thread1.start();
        //thread.run(); The run() method is executed in the current thread, not as a separate thread
        
    }
}
