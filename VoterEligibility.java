//Develop a program that takes a user's age as input and determines if they are eligible to vote (age >= 18). 
//If the user enters non-numeric text or a negative number, catch the NumberFormatException and IllegalArgumentException respectively, displaying appropriate error messages.
package collection;
import java.util.Scanner;

public class VoterEligibility
{
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); // Create a scanner object to read user input

	        try {
	            System.out.print("Enter your age: "); // Prompt the user to enter their age
	            int age = Integer.parseInt(scanner.nextLine()); // Parse the user input as an integer and store it in age

	            if (age == 0) { // If the age is 0
	                throw new IllegalArgumentException("Invalid input! Age cannot be zero."); // Throw an exception with a custom message
	            }

	            if (age >= 18) { // If the age is greater than or equal to 18
	                System.out.println("You are eligible to vote!"); // Print a message that the user can vote
	            } else { // If the age is less than 18
	                System.out.println("You are not eligible to vote yet."); // Print a message that the user cannot vote yet
	            }
	        } catch (NumberFormatException e) { // If the user input is not a valid number
	            System.out.println("Invalid input! Please enter a valid age as a number."); // Print an error message
	        } catch (IllegalArgumentException e) { // If the user input is negative or zero
	            System.out.println(e.getMessage()); // Print the custom message from the exception
	        }

	        scanner.close(); // Close the scanner object to avoid memory leaks
	    }
	}
