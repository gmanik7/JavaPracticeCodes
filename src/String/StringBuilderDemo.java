package String;

import java.util.GregorianCalendar;

public class StringBuilderDemo {
    /**
     * Not Thread safe
     * Not synchronized
     * Since java 1.5
     * Faster
     */

    public static void main(String[] args) {
        System.gc();
        long start=new GregorianCalendar().getTimeInMillis();
        long startMemory=Runtime.getRuntime().freeMemory();
        //StringBuffer sb = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<10000000; i++){
            sb.append(":").append(i);
        }
        long end=new GregorianCalendar().getTimeInMillis();
        long endMemory=Runtime.getRuntime().freeMemory();
        System.out.println("Time Taken:"+(end-start));
        System.out.println("Memory used:"+(startMemory-endMemory));
    }

}
/**
 * with StringBuffer
 * output: Time Taken:1068
 *         Memory used:-101241960
 *
 *with StringBuilder
 * output: Time Taken:638
 *         Memory used:-153640920
 *
 *  So, clearly we can see StringBuilder is faster.
 */
