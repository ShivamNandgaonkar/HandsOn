package HandsOn;
import java.util.LinkedList;
public class QueueOperations
{
    public static void main(String[] args)
    {
        // Create a queue
        LinkedList<String> queue = new LinkedList<>();
        
        // Enqueue some elements
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        
        // Dequeue some elements
        System.out.println(queue.remove()); // prints "First"
        System.out.println(queue.remove()); // prints "Second"
        System.out.println(queue.remove()); // prints "Third"
        
        // Check if the queue is empty
        if (queue.isEmpty())
        {
            System.out.println("The queue is empty.");
        } else
        {
            System.out.println("The queue is not empty.");
        }
        
        // Print the elements in the queue
        for (String element : queue)
        {
            System.out.println(element);
        }
    }
}
