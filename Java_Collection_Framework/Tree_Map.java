package Java_Collection_Framework;

import java.util.*;
import java.util.TreeMap;

public class Tree_Map {

    public static void main(String[] args) {


        Map<String, Integer> numbers = new TreeMap<>(); //log(n)
        // Map<Key,Value>

        //Sorted in Alphabetically order

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);

        System.out.println(numbers);
        /*
        if the specified key is not already associated with a value (or is mapped to null) associates it with
         the given value and returns null, else returns the current value.
        */
        numbers.putIfAbsent("Two", 23);
        System.out.println(numbers);


        //Returns true if this map contains a mapping for the specified key.

        //numbers.containsKey(4);
        System.out.println(numbers.containsKey("Four"));

        //Returns true if this map, maps one or more keys to the specified value.

        //numbers.containsValue(12);
        System.out.println(numbers.containsValue(12));

        //Returns true if this map contains no key-value mappings

        // numbers.isEmpty();
        System.out.println(numbers.isEmpty());

        //Iteration

        for (Map.Entry<String, Integer> e : numbers.entrySet()) {

            System.out.println(e);

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        for (String key : numbers.keySet()) {
            System.out.println(key);

        }
        for (Integer value : numbers.values()) {
            System.out.println(value);

        }

        //Removes the mapping for a key from this map if it is present

        numbers.remove("Three");
        System.out.println(numbers);

        //Removes all the mappings from this map (optional operation). The map will be empty after this call returns.

        numbers.clear();
        System.out.println(numbers);



    }

}
