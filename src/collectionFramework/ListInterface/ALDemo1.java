package collectionFramework.ListInterface;

import java.util.ArrayList;
import java.util.Collections;




/**
 *
 * ArrayList is modern class of collections framework
 * ArrayList introduced because of memory management of vector (when we create instance of vector class,
 *  it will create initial capacity of 10, and increment will be 100%)
 *  In case of, ArrayList, the increment will be only 50% only.
 *  And initial capacity will be allotted to arraylist if we start adding elements to arraylist.
 *  But in vector, directly allotted initial capacity, even if we not add any values.
 * ArrayList capacity :
 *  initial arr capacity is 10,
 *  if you add more than 10 elements, then capacity will happen 50% increment of initial capacity.
 *  But, we cannot see the capacity through the method
 *  And almost most of the similar methods will be present in the arrayList same as vector class
 *  We can convert array to list also
 *
 *  methods:
 *  add(); to add elements
 *  addAll(); to add all elements once e.g. adding other list elements to existing list
 *  size();  to know the size of the array
 *  set(index,value); to replace the value with given index
 *  isEmpty(); checking whether list is empty or not
 *  indexOf(); to know the index of the particular value
 *  We can iterate through ForEach/For loop
 *  get(index); to retrieve elements
 */


public class ALDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>(100);// can define capacity here itself

        System.out.println("Before adding elements: "+a1);  //object a1 value is null here
        System.out.println("Before adding elements: "+a1.size());



        a1.add(12);
        a1.add(32);
        a1.add(15);
        a1.add(33);
        a1.add(16);
        a1.add(34);
        a1.add(17);
        a1.add(35);
        a1.add(39);
        a1.add(22);
        a1.add(65);
        a1.add(65); //allow duplicates
        a1.add(null); // allow null values




        System.out.println(a1);

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(100);
        a2.add(200);
        a2.add(500);

        //a1.addAll(a2);
        a1.addAll(0,a2);
        System.out.println(a1);

        a1.set(0,600);
        System.out.println(a1);

        System.out.println(a1.size());
        System.out.println(a1.contains(500));
        System.out.println(a1.indexOf(500));
        System.out.println(a1.isEmpty());
        System.out.println(a1.remove("33"));
        System.out.println(a1.removeAll(a2));

    //Using foreach
        System.out.println(a1);
        for (Integer a:a1
             ) {

            System.out.println(a);
        }
        //making synchronous using Collections.synchronizedList();
        System.out.println(Collections.synchronizedList(a1));

    }
}
