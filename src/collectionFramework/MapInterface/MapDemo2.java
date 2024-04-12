package collectionFramework.MapInterface;
import java.util.*;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Hashtable<Integer,String> h1 = new Hashtable<>();

        h1.put(1,"AS");
        h1.put(2,"AP");
        h1.put(3,"TS");
        h1.put(3,"KA");//im adding another value with same key , for that key the value will be updated
                        //No duplicates
        h1.put(4,"HP");
        h1.put(6,"WB");
        h1.put(5,"AR");

        //Updation
        h1.putIfAbsent(3,"KL");
        h1.replace(2,"MH");
        //deletion
        h1.remove(1);

        //verification
        System.out.println(h1.containsKey(2));
        System.out.println(h1.containsValue("MH"));

        System.out.println(h1);
        System.out.println(h1.size());

        //clear all from the map
     //   h1.clear();
     //   System.out.println(h1);

        //difference between keyset and entry set
        /**
         * In key set we have only keys
         * But in entry set, we have both keys and values
         */

       Set<Map.Entry<Integer,String>> entries =  h1.entrySet();
       for (Map.Entry<Integer,String> entry: entries){
           Integer key = entry.getKey();
           String value = entry.getValue();
           System.out.println("Key: "+key+" ---------> "+"value: "+value);
       }
    }

}
