package collection;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
		public static void main(String[] args) {
			//Creating a Queue of Integer type using a LinkedList
			Queue<Integer> queue = new LinkedList<Integer>();
			
			//Enqueueing elements into the queue
			queue.add(65);
			queue.add(411);
			queue.add(307);
			queue.add(80);
			
			//Printing the elements in the queue
			System.out.println("The queue contains: " + queue);
			
			//Dequeueing elements from the queue
			System.out.println("Dequeued element: " + queue.remove());
			System.out.println("Dequeued element: " + queue.remove());
			
			//Printing the elements in the queue after dequeueing
			System.out.println("The queue contains after dequeueing: " + queue);
			
			//Checking whether the queue is empty
			boolean empty = queue.isEmpty();
			
			if (empty) {
				System.out.println("The queue is empty");
			} else {
				System.out.println("The queue is not empty");
			}
			
		}
	}


