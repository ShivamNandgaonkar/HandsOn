//Write a Java program that sorts a list of strings in alphabetical order using the Collections framework.
package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingBirds 
{
    public static void main(String[] args) 
    {
        // Create a list of strings
        List<String> stringList = new ArrayList<>();
        //// Add birds to the list
        stringList.add("*Blue Jay");
        stringList.add("*Red Crested Turaco");
        stringList.add("*Golden Pheasant");
        stringList.add("*Painted Bunting");
        stringList.add("*Flamingo");

        // Sort the list in alphabetical order
        Collections.sort(stringList);

        // Print the sorted list
        System.out.println("Sorted List According to the Alphabetical Order:");
        for (String str : stringList) 
        {
            System.out.println(str);
        }
    }
}
