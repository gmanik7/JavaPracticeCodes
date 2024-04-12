package RunTimeClass;

import java.io.IOException;

public class RunTime1 {
    public static void main(String[] args) {
        Runtime.getRuntime();
        System.out.println( Runtime.getRuntime().availableProcessors()); // 8
        try{
            Runtime.getRuntime().exec("notepad"); //will open notepad
        }
        catch(IOException e){

        }
        System.out.println(Runtime.getRuntime().totalMemory());
        System.out.println(Runtime.getRuntime().freeMemory()    );




    }
}
