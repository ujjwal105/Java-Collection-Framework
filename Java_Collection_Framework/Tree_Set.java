package Java_Collection_Framework;

import java.util.*;
import java.util.TreeSet;

public class Tree_Set {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(); // log(n )

        //Adds the specified element to this set if it is not already present:-

        // Sorted Form or in ascending order & unique element

        set.add(12);
        set.add(13);
        set.add(2);
        set.add(25);

        System.out.println(set);


        //Removes the specified element from this set if it is present

        set.remove(12);

        System.out.println(set);

        // Check weather the given element is in the given HashSet & return Boolean Value

        System.out.println(set.contains(13));

        // Returns true if this set contains no elements.

        System.out.println(set.isEmpty());

        //Returns the number of elements in this set

        System.out.println(set.size());

        // Removes all the elements from this set

        set.clear();
        System.out.println(set);

    }
}
