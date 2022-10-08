package Java_Collection_Framework;

import java.util.*;

public class PriorityQueue{
    public static void main(String[] args) {


        //  Queue<Integer> pq = new java.util.PriorityQueue<>();

        // for reversing the priority

        Queue<Integer> pq = new java.util.PriorityQueue<>(Comparator.reverseOrder());


        // Inserts the specified element into this queue

        pq.offer(20);
        pq.offer(27);
        pq.offer(23);
        pq.offer(16);

        System.out.println(pq);


        // Retrieves and removes the head of this queue, or returns null if this queue is empty.

        pq.poll();
        System.out.println(pq);

        /*  Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.

         pq.peek();

        */

        System.out.println(pq.peek());

    }


}
