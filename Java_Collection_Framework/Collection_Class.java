package Java_Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collection_Class {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(14);
        list.add(15);
        list.add(34);
        list.add(56);
        list.add(74);
        list.add(34);
        list.add(29);


        System.out.println("Min Element " + Collections.min(list));
        System.out.println("Max Element " + Collections.max(list));
        System.out.println("Frequency " + Collections.frequency(list,14));

        Collections.sort(list);
       // Collections.sort(list, Comparator.reverseOrder());

        System.out.println(list);


    }
}
