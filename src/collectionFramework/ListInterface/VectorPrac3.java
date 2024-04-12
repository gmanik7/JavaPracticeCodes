package collectionFramework.ListInterface;

import java.util.Arrays;
import java.util.Vector;

public class VectorPrac3 {
    public static void main(String[] args) {
        /**
         * Converting array to list
         *
         */

        Object[] arr = new Object[]{1,20,15,8};
        Vector v1 = new Vector(Arrays.asList(arr));

        /**
         * When you create vector class , default capacity is 10.
         * But when you create it from array, the default capacity will be
         * the total no of elements in the array
         */
        System.out.println(v1);

        System.out.println(v1.capacity()); //4

        System.out.println(v1.size());//4
    }
}
