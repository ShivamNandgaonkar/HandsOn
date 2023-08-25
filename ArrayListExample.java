package HandsOn;
import java.util.ArrayList;
public class ArrayListExample 
{
    public static void main(String[] args) 
    {
        // Create an ArrayList object
        ArrayList<String> list = new ArrayList<>();
        
        // Add elements to the list
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");
        
        // Remove an element from the list
        list.remove("Orange");
        
        // Update an element in the list
        list.set(0, "Pear");
        
        // Display the contents of the list
        System.out.println(list);
    }
}