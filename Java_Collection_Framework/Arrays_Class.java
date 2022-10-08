package Java_Collection_Framework;

import java.util.*;

public class Arrays_Class {
    public static void main(String[] args) {

       /*
       int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(numbers,4);
         System.out.println(index);
      */


      //Sorts the specified array into ascending numerical order.
        int[] numbers = {1,4,6,8,9,3,4,10,14,2};
        Arrays.sort(numbers);
        for (int i : numbers){
            System.out.print (" " +i );
        }

        //Assigns the specified int value to each element of the specified array of ints.
        Arrays.fill(numbers,12);

    }

}
