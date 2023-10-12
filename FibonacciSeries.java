package loops;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();
        
        int num1 = 0, num2 = 1;
        
        System.out.print("Fibonacci Series up to " + limit + ": ");
        
        while (num1 <= limit) {
            if (num1 % 3 != 0) {
                System.out.print(num1 + " ");
            }
            
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        
        scanner.close();
    }
}
