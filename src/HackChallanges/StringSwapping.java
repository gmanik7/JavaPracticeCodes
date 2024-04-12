package HackChallanges;

import java.util.Scanner;

public class StringSwapping {

    public static String Swap(String s){
        int a  = s.indexOf(" ");
        int b = s.length();
        s = s.substring(a,b)+" "+s.substring(0,a);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(StringSwapping.Swap(str));
    }

}
