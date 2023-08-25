package HandsOn;
import java.util.Scanner;
public class EligibleVote
{
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        // Create a Scanner object to read user input.
        Scanner sc= new Scanner(System.in);
        
        // Try to parse the user input as an integer.
        try
        {
        	// Print the user to enter their age.
            System.out.println("Enter your age: ");
            
            //Get the input from the user using parseInt()
        	int age = Integer.parseInt(sc.nextLine());
        	
        	if(age<0)
        	{
        		//Throw the new exception to the catch block
        		throw new IllegalArgumentException("Invalid Age! Please Enter Valid age");
        	}
        	
            // Check if the user is eligible to vote.
        	//using if else condition
            if (age >= 18)
            {
                System.out.println("You are eligible to vote.");
            } 
            else 
            {
                System.out.println("You are not eligible to vote.");
            }
        }
        //catch the exceptions
        // The user entered non-numeric text.
        catch (NumberFormatException e) 
        {
            //Print the Statement
            System.out.println("Invalid input. Please enter a number.");
        } 
        // The user entered a negative number.
        catch (IllegalArgumentException e) 
        {
            //Print the Statement
            System.out.println("An exception occurred: "+e.getMessage());
        }
        sc.close();
    }
}