package collectionFramework.ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * LinkedList implements List, Deque interfaces
 *
 * -----------------NODE-----------------
 *
 *  -------------------------------------
*   |           |           |           |
 *  | PREV      | ITEM      |   NEXT    |
 *  |           |           |           |
 *  |           |           |           |
 *  -------------------------------------
 *
 *  EACH NODE HAS THREE SECTIONS,
 *  PREVIOUS, ITEM, NEXT
 *
 *  COMBINATION OF THESE NODES IS CALLED LINKED-LIST.
 *
 *  And we can perform all operations as in arrayList like add, remove, set,get,addAll(),removeAll() etc..
 *
 *  BestPart is you can add elements anywhere
 *  For eg: if you want to add elements in between in vector class,
 *  then you need to shift all elements to right from that index. So it takes more time.
 *
 *  But, in linked list, if you want to add element anywhere, there will be only two operations only, that is
 *      1.prev object value will be changed.
 *      2.next object value will be changed.
 *      High performance, less time
 *
 *      There are two types of LinkedList
 *      1.Single LinkedList (we have next obj value in node)
 *      2.Double LinkedList (here we have both prev and next obj values in node,
 *                          in java we implement double linkedlist only)
 *
 */
public class LinkedLDemo1 {
    public static void main(String[] args) {
        //Below implementations all are correct, because LinkedList implements both interfaces, List and Deque

        //        List<Integer> l2 = new LinkedList<>();
        //        Deque<Integer> l3 = new LinkedList<>();

        LinkedList<Integer> l1 = new LinkedList<>();


        l1.add(25);
        l1.add(30);
        l1.add(50);
        l1.add(45);
        l1.add(2,50);
        l1.set(0,300);
        l1.remove(2);
        l1.remove("50");
        l1.clear();

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(100);
        l2.add(500);
        l2.add(1000);
        l2.add(null); // allow null values
        l2.add(500); // allow duplicates

        l1.addAll(0,l2);

        System.out.println(l1);

        for (Integer i: l1
             ) {
            System.out.println(i);
        }




    }
}
