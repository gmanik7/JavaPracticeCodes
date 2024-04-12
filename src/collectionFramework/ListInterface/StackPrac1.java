package collectionFramework.ListInterface;

import java.util.Stack;

/**
 * Basically there are two principles in data structures
 * 1.LIFO  (Stack follows Lifo principle)
 * 2.FIFO  (Queue follows Fifo principle)
 *
 * Stack class  extends  Vector class
 * Generally Visualize stack in Vertical manner.
 *
 * Stack performs all operations which are there in vector class.
 *
 * It provides additional features(methods).
 *
 * push(); almost same as add
 * pop();  removes last obj at stack
 * peek(); shows last obj of stack
 * search(); search Returns the number position from the last obj
 *
 *
 */
public class StackPrac1 {
    public static void main(String[] args) {
        Stack<String> s1 = new Stack<>();
        s1.add("Red");
        s1.add(0,"White");
        s1.add("Pink");
        s1.add("Magenta");
        s1.add("Black");
        s1.add(0,"Marron");
        s1.add("Yellow");
        s1.add("Orange");
        s1.pop();
        System.out.println(s1.search("Red"));

        System.out.println(s1.peek());
        System.out.println(s1);
    }
}
