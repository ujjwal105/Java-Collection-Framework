package Java_Collection_Framework;

import java.util.ArrayDeque;
public class Array_Deque {

    public static void main(String[] args) {

    ArrayDeque<Integer> adq = new ArrayDeque<>();

    //Inserts the specified element at the end of this deque
       adq.offer(12); //from Queue
       adq.offerLast(13); // from Arraydeque
        adq.offerLast(15); // from Arraydeque

    //Inserts the specified element at the front of this deque.
       adq.offerFirst(10); // from Arraydeque

        System.out.println(adq);

    //Retrieves, but does not remove, the head of the queue represented by this deque, or returns null if this deque is empty.
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq. peekLast());

    //Retrieves and removes the head of the queue represented by this deque (in other words,
    // -- the first element of this deque), or returns null if this deque is empty.
        System.out.println(adq.poll());
        System.out.println("polL() " +adq);

    //Retrieves and removes the first element of this deque, or returns null if this deque is empty.
        System.out.println(adq.pollFirst());
        System.out.println("pollFirst()" +adq);

    //Retrieves and removes the last element of this deque, or returns null if this deque is empty.
        System.out.println(adq.pollLast());
        System.out.println("pollLast()" +adq);

    }

}
