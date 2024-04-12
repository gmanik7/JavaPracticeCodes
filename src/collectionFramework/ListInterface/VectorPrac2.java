package collectionFramework.ListInterface;

import java.util.Vector;

public class VectorPrac2 {
    public static void main(String[] args) {
        //creating list
        Vector v1 = new Vector();
        v1.add("Raghupathi");
        v1.add("Raghava");

        System.out.println(v1);

        //creating another list


        Vector v2 = new Vector();
        v2.add("RajaRam");

        /**By two ways we can add elements to first list from second list
         * Using For loop
         * Using addAll(Collection c) method
         * Using addAll(index,Collection c) method with index position
         */

//        for (int i = 0;i<v2.size();i++){
//            v1.add(v2.get(i));
//        }

        v1.addAll(v2); //[Raghupathi, Raghava, RajaRam]
        v1.addAll(0,v2); //[RajaRam, Raghupathi, Raghava]
         System.out.println(v1);
    }
}
