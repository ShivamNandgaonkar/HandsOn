package loops;
import java.util.Scanner;

class SumEvenNumbers
{
    public static void main(String[] args) 
    {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer (or 'q' to quit): ");
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            int num = Integer.parseInt(input);
            if (num < 0) {
                continue;
            }
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println("The sum of all even numbers entered is: " + sum);
        scanner.close();
    }
}
