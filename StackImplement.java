package collection;
import java.util.ArrayList;
public class StackImplement {
	
	//Creating an ArrayList to store the stack elements
		ArrayList<Integer> stack = new ArrayList<Integer>();
		
		//Pushing an element onto the stack
		public void push(int element) {
			stack.add(element);
		}
		
		//Popping an element from the stack
		public int pop() {
			if (isEmpty()) {
				System.out.println("The stack is empty");
				return -1;
			} else {
				return stack.remove(stack.size() - 1);
			}
		}
		
		//Checking whether the stack is empty
		public boolean isEmpty() {
			return stack.isEmpty();
		}
		
		//Displaying the elements in the stack
		public void display() {
			System.out.println("The stack contains: " + stack);
		}
		
		public static void main(String[] args) {
			//Creating an object of the StackExample class
			StackImplement s = new StackImplement();
			
			//Pushing some elements onto the stack
			s.push(10);
			s.push(20);
			s.push(30);
			
			//Displaying the elements in the stack
			s.display();
			
			//Popping some elements from the stack
			System.out.println("Popped element: " + s.pop());
			System.out.println("Popped element: " + s.pop());
			
			//Displaying the elements in the stack after popping
			s.display();
			
		}
}
