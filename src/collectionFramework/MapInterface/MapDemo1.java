package collectionFramework.MapInterface;

import java.util.*;

/**
 * in Java, Map Interface is present in java.util package represents a mapping between a key and a value.
 * Java Map interface is not a subtype of the Collection interface.
 * Therefore, it behaves a bit differently from the rest of the collection types.
 * A map contains unique keys.
 *
 * why and when to use Maps.
 *
 * Maps are perfect to use for key-value association mapping such as dictionaries.
 * The maps are used to perform lookups by keys or when someone wants to retrieve and update elements by keys.
 * Some common scenarios are as follows:
 *
 * A map of error codes and their descriptions.
 * A map of zip codes and cities.
 * A map of managers and employees. Each manager (key) is associated with a list of employees (value) he manages.
 * A map of classes and students. Each class (key) is associated with a list of students (value).
 *
 * Characteristics of a Map Interface
 * A Map cannot contain duplicate keys and each key can map to at most one value.
 * Some implementations allow null key and null values like the HashMap and LinkedHashMap, but some do not like the TreeMap.
 * The order of a map depends on the specific implementations.
 * For example, TreeMap and LinkedHashMap have predictable orders, while HashMap does not.
 * There are two interfaces for implementing Map in Java.
 * They are Map and SortedMap, and three classes: HashMap, TreeMap, and LinkedHashMap.
 */

class Employee{
     int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
public class MapDemo1 {
    public static void main(String[] args) {
        /**
         * we can any use any implementation of map creation.
         * By using them we can perform below operations.
         *
         */
        //   Map<Integer,String> h1 = new Hashtable<>();
        //   Map<Integer,String> h1 = new HashMap<>();
        //   Map<Integer,String> h1 = new TreeMap<>();
             Map<Integer,String> h1 = new LinkedHashMap<>();



        //addition of elements
        h1.put(100,"Hyderabad");
        h1.put(101,"Chennai");
        h1.put(102,"Banglore");

        //retrieval of keys from map
        Set<Integer> keys = h1.keySet();
        for(Integer key : keys){
            System.out.println(key);
        }
        //retrieval of values from map
        Collection<String> values = h1.values();
        for (String s : values){
            System.out.println(s);
        }
        //retrieval of value using from the map base on a key
      //  System.out.println(h1.get(100));

        for(Integer key : keys){
            System.out.println( key+" ---> "+h1.get(key));
        }

    }
}
