package String;

public class StringDemo {
    public static void main(String[] args) {
        /**
         * Collections of characters is called a String.
         * String are immutable(No change once created)
         * 2 ways of creating string object
         * a) By using new keyword
         * b) By using string literal
         */

    //  String str = new String(" Welcome to java ");

        String str = " Welcome to java ";
        String str1 = "Programming";


        System.out.println(str);
        System.out.println("Before trimming: "+str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println("Before trimming: "+str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.indexOf("t"));
        System.out.println(str.concat(str1));







    }
}
