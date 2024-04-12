package collectionFramework.Queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * The Queue interface is present in java.util package and extends the Collection interface is used to hold the elements about to be processed in FIFO(First In First Out) order.
 * It is an ordered list of objects with its use limited to inserting elements at the end of the list and deleting elements from the start of the list, (i.e.),
 * it follows the FIFO or the First-In-First-Out principle.
 *
 * priority queue offers similar methods as other standard collection classes.
 * add <--> offer   both methods can be used
 * get ---> peek    to retrieve the elements
 * remove <---> poll  to remove the elements
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        //creation of priorityqueue
        Queue<Integer> q1 = new PriorityQueue<>();
        q1.add(5);
        q1.offer(8);
        q1.offer(7);
        q1.add(7); // allows duplicates
        q1.add(2);
        q1.add(1);

    //  q1.add(null); // doesn't allow null values

        System.out.println(q1);
        /**
         * output: [1, 5, 2, 8, 7, 7]
         * here in output we see, it is neither maintaining  insertion order nor sorted order
         * In above pq, 1 is pointing to head, it is priority queue
         */



    }
}
