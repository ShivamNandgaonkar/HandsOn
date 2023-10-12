//Write a Java program that demonstrates the usage of a Queue (LinkedList):
//Enqueue a series of elements.
//Dequeue elements from the Queue.
//Print the elements after each dequeue operation.
package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLink 
{
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Add elements to the Queue
        queue.add("Norway 1"); // Adds "Element 1" to the end of the queue
        queue.add("Switzerland 2"); // Adds "Element 2" to the end of the queue
        queue.add("Greenland 3"); // Adds "Element 3" to the end of the queue
        queue.add("France 4"); // Adds "Element 4" to the end of the queue
        queue.add("Europe 5"); // Adds "Element 5" to the end of the queue

        // Dequeue elements from the Queue and print after each dequeue operation
        while (!queue.isEmpty()) {
            String element = queue.poll(); // Removes and returns the head of the queue (first element)
            System.out.println("Dequeued: " + element); // Prints the dequeued element
        }
    }
}



