package String;


/**
 * StringBuffer is Thread safe.
 * Synchronized
 * Since java 1.0
 * Slower
 *
 * Important Constructors of StringBuffer:
 *
 * StringBuffer(): creates an empty string buffer with an initial capacity of 16.
 * StringBuffer(String str): creates a string buffer with the specified string.
 * StringBuffer(int capacity): creates an empty string buffer with the specified capacity as length.
 */

public class StringBufferDemo{
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity()); //16 it is initial capacity

        StringBuffer sb2 = new StringBuffer(32);
        System.out.println(sb2.capacity()); //32

        StringBuffer sb = new StringBuffer("welcome to java");
        System.out.println(sb.capacity()); //31




        System.out.println(sb);
        System.out.println(sb.append(" programming"));
        System.out.println(sb.insert(27," - sbtech"));
        System.out.println(sb.replace(11,15,"python"));
        System.out.println(sb.delete(3,7));
        System.out.println(sb.reverse());
        System.out.println(sb.reverse());
        System.out.println(sb.length());
        System.out.println(sb.charAt(4));
        System.out.println(sb.indexOf("t"));
        System.out.println(sb.substring(7));
        System.out.println(sb.substring(7,11));

    }
}
