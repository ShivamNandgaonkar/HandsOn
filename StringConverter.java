//Write  a Java program that reads a string input from the user. 
//Convert the string to an integer using the Integer.parseInt() method. Handle the NumberFormatException that can occur if the input cannot be parsed as an integer. 
//Display a message indicating that the input is not a valid integer.
package collection;

import java.util.Scanner;

public class StringConverter 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");

        // Read the string from the user input
        String input = scanner.nextLine();

        try {
            // Convert the string to an integer
            int number = Integer.parseInt(input);

            // Print the converted integer
            System.out.println("The converted integer is: " + number);
        } catch (NumberFormatException e) {
            // Print an error message if the input is not a valid integer
            System.out.println("Oops! The input is not a valid integer.");
        }
    }
}
