package HandsOn;
/*
Write a Java program to create an ArrayList of integers and perform the following operations:
a. Add elements to the ArrayList.
b. Remove an element from a specific index.
c. Update an element at a specific index.
 */
import java.util.ArrayList;

public class Arrraylist 
{
    public static void main(String[] args)
    {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        // Add elements to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        // Remove an element from a specific index
        numbers.remove(2);
        // Update an element at a specific index
        numbers.set(1, 100);
        // Print the ArrayList
        System.out.println(numbers);
    }
}