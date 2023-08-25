package HandsOn;
import java.util.HashSet;
public class HashSetDemo 
{
    public static void main(String[] args) 
    {
        // Create a HashSet object
        HashSet<String> set = new HashSet<>();
        
        // Add elements to the set
        set.add("Apple");
        set.add("Orange");
        set.add("Banana");
        
        // Check whether a specific element exists in the set
        System.out.println("Does the set contain the element 'Apple'? " + set.contains("Apple"));
        
        // Remove an element from the set
        set.remove("Apple");
        
        // Print the elements of the set
        System.out.println("The elements of the set are: " + set);
    }
}