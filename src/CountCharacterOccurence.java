import javax.swing.*;
import java.util.SortedSet;

public class CountCharacterOccurence {
    public static void main(String[] args) {
        int MAX_CHAR = 256;
        String str = "manikantasai";

        int totallength = str.length();

        //one way of doing

//        int lengthAfterRemovingCharA = str.replace("a","").length();
//
//        int count = totallength - lengthAfterRemovingCharA;
//
//        System.out.println("Number of occurances of A: "+count );4

        int[] arr = new int[MAX_CHAR];

        for(int i =0;i<=totallength;i++){
            arr[str.charAt(i)]++;
        }

        char[] ch = new char[totallength];
        for (int i =0;i<=totallength;i++) {
            ch[i] = str.charAt(i);
            int count = 0;
            for(int j=0;j<=i;j++){
                if(str.charAt(i) == ch[j]){
                    count++;
                }
                if(count == 1){
                    System.out.println("No of occureneces of "+str.charAt(i)+" is"+arr[str.charAt(i)]);
                }
            }
        }
    }
}
