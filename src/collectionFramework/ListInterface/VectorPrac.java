package collectionFramework.ListInterface;

import java.util.Arrays;
import java.util.Vector;
/**
 * Vectors was introduced in java 1.0v,
 * But collections introduced in 1.2v,
 * Generics introduced in 1.5
 *
 * Generally, collections work with Non-Primitive DataTypes
 * bcoz you can create object with non-primitive datatype only
 * e.g. When you create vector class instance,
 *      Vector<Integer> v1 = new Vector();

 */

/**
 * Vector capacity :
 *  initial arr capacity is 10,
 *  if you add more than 10 elements, then capacity will happen 100% increment initial capacity.
 *  size:1-10, capacity:10
 *  size:11-20, capacity: 20
 *  size:21-40,capacity: 40
 *  size:41-80, capacity: 80
 *  size: 81-160,capacity:160
 *  ..
 *  ..
 *  .. so on
 */

//vector
public class VectorPrac {
    public static void main(String[] args) {
        //size - no of elements present in the list;
        //capacity - array  capacity

        Vector v1 = new Vector();
        System.out.println("Before adding elements: "+v1);  //object v1 value is null here
        System.out.println("Before adding elements: "+v1.capacity());
        System.out.println("Before adding elements: "+v1.size());


        //adding values to list

        v1.add("sai");
        v1.add("raju");
        v1.add("ramu");

        /**Retrieving elements from list by two ways
            1.By object
            2. Using get(int index) method
         */


        for (int i = 0;i<v1.size();i++){
            v1.get(i);
        }

        System.out.println(v1);

        System.out.println("Array size: "+v1.size()); //3
        System.out.println("Array Capacity: "+v1.capacity());//10

        /**Deletion of elements from list
         * remove(index) removes value  at which index is specified
         * remove(value)  removes particular value which specified  in the parameter
         *removeAll(Collection c) removes entire collection
         * clear() removes all elements in the list
         *
         */

        v1.remove(0);
        // v1.remove("sai");
        //v1.clear();
        System.out.println(v1);//[raju, ramu]

        /**
         * Verification of elements
         * contains(" ")
         * containsAll(" ")
         */

        System.out.println(v1.contains("raju"));
        System.out.println(v1.contains("raju kumar"));

        /**
         * converting list to array
         */
        Object[] arr = v1.toArray();
        System.out.println(Arrays.toString(arr));

        /**
         * Replacing existing value with new value
         */


        v1.set(1,"Sai");
        System.out.println(v1);



    }
}
