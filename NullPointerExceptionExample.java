package collection; 

import java.util.Scanner;

public class NullPointerExceptionExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // use a meaningful name

        System.out.print("Enter a string (or 'quit' to end the program): ");
        String input = scanner.nextLine();

        try {
            if (input.equals("quit")) { // check if the user wants to quit
                System.out.println("Bye!");
                return; // end the program
            }
            int length = input.length(); // this will not throw an exception if input is not null
            System.out.println("Length of the input string: " + length);
        } catch (NullPointerException exception) { // use a meaningful name
            System.out.println("An exception occurred: " + exception.getMessage());
        } finally {
            scanner.close(); // close the scanner in a finally block
        }
    }
}
