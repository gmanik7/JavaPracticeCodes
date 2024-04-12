package String;

class NamingDemo extends Thread{
    @Override
    public void run() {
        System.out.println("Task1 executing");

        String str = "chikky";
        for(int i = 0;i < str.length();i++){
            try{
                System.out.print(str.charAt(i)+" ");
                Thread.sleep(500);
            }
            catch(Exception e){
                System.out.println("something went wrong");
            }

        }
    }
}
class NamingDemo2 extends Thread{
    @Override
    public void run() {
        System.out.println("\nTask2 executing");
        String str = "Luckky";
        for (int i = 0; i < str.length(); i++) {
            try {
                System.out.print(str.charAt(i)+" ");
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("something went wrong");
            }

        }
    }
}

    public class StringBufferDemo2 {
        public static void main(String[] args) {
            NamingDemo namingDemo = new NamingDemo();
            Thread t1 = new Thread(namingDemo);
            NamingDemo2 namingDemo2 = new NamingDemo2();
            Thread t2 = new Thread(namingDemo2);
            t1.start();
            try
            {
                t1.join();
            }
            catch (InterruptedException e){
                System.out.println("something went wrong");
            }

            t2.start();
        }
    }

