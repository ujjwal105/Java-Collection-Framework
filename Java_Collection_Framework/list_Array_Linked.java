package Java_Collection_Framework;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.lang.*;
import java.util.LinkedList;


public class list_Array_Linked {

    public static void main(String[] args) {


        List<Integer> number = new ArrayList<>();


       /*
          Similarly

         List<Integer> number = new LinkedList<>();


        */


        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        System.out.println(number);
        number.add(4,7);
        System.out.println(number);


        List<Integer> list = new ArrayList<>();

        list.add(45);
        list.add(50);
        list.add(55);

        // This will add both the list

        number.addAll(list);

        System.out.println(number);

        //This will get the element from Arraylist

        System.out.println(number.get(5));

        // This will use to update the value of element

        System.out.println(number.set(4,8));

        //This will remove that specific index element

        number.remove(7);

        System.out.println(number);

        //This will remove that specific element you mentioned

        number.remove(Integer.valueOf(55));

        //This will remove all the element from Arraylist

        //number.clear();

        System.out.println(number);

        // Check weather the element is in the list or not

         System.out.println( list.contains(45));

         // for Traversing the arraylist

         //for loop

        for (int i = 0; i< number.size();i++){

            System.out.println("The element is : " + i);
        }

        // For each loop

        for (int x: number) {

            System.out.println(" 'For each' The element is : " + x);

        }

        // Iterator

        Iterator<Integer> it = number.iterator();

        while (it.hasNext()){
            System.out.println(" 'Iterator' The element is : " +  it.next());

        }

    }
}
