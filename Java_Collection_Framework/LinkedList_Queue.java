
package Java_Collection_Framework;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_Queue {
    public static void main(String[] args) {
        Queue<Integer> Queue = new LinkedList<>();

        /*
         Inserts the specified element into this queue

        Queue.offer();
        Queue.add();

        */

        Queue.offer(12);
        Queue.offer(13);
        Queue.offer(14);

        System.out.println(Queue);

        /*
         Retrieves and removes the head of this queue, or returns null if this queue is empty

         Queue.poll();
         Queue.remove();

        */

        System.out.println(Queue.poll());

        // So now the Queue is :-

        System.out.println(Queue);

        /*
       Retrieves, but does not remove the head of this queue, or returns null if this queue is empty.

        Queue.peek();
        Queue.element();

       */

        System.out.println(Queue.peek());

    }
}


/*

Some commonly used methods of the Queue interface are :-

 add() - Inserts the specified element into the queue. If the task is successful, add() returns
 true, if not it throws an exception.

 offer() - Inserts the specified element into the queue. If the task is successful, offer()
 returns true, if not it returns false.

 element() - Returns the head of the queue. Throws an exception if the queue is empty.

 peek() - Returns the head of the queue. Returns null if the queue is empty.

 remove(); Returns and removes the head of the queue. Throws an exception if the queue
 is empty.

 poll() - Returns and removes the head of the Queue. Returns null if the queue is empty.

*/

