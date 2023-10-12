
//*In this example, the program prompts the user to enter a number. 
//*It then attempts to parse the user's input into an integer using Integer.
//*parseInt(). If the user enters non-numeric text, the NumberFormatException
//*unchecked exception can occur.
//*The try block contains the input and parsing operations.
//If a NumberFormatException occurs, the catch block catches 
//the exception and informs the user about the invalid input.
package collection;	 
import java.util.Scanner;

public class NumberFormatExceptionEx 
{
    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in)) // try-with-resources statement
        {
            System.out.print("Enter a number: ");
            int userInput = scanner.nextInt(); // nextInt() method
            System.out.println("You entered: " + userInput);
        } 
        catch (NumberFormatException ex) // changed exception type to NumberFormatException
        {
            System.out.println("Invalid input. Please enter a valid number.");
        }   
        System.out.println("Program continues...");
    }
}
