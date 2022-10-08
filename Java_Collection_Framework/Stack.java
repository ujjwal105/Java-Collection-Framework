package Java_Collection_Framework;

// Java class for Stack

public class Stack {
    public static void main(String[] args) {

       // object

       java.util.Stack<String> car = new java.util.Stack<>();

       //To Add Element

        car.push("Mercedes");
        car.push("Audi");
        car.push("Thar");
        car.push("Jeep");
        car.push("Kia");

        System.out.println(car);

        // Looks at the object at the top of this stack without removing it from the stack.

        car.peek();
        System.out.println(car.peek());

        //Removes the object at the top of this stack and returns that object as the value of this function

        car.pop();
        System.out.println(car.pop());

       // After removing the Top element of the Stack Now the Top element is Jeep

        System.out.println(car);

    }
}
