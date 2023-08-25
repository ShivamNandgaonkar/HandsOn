package HandsOn;
import java.util.Scanner;
public class ArithmeticOperation
{
    public static void main(String[] args) 
    {
    	
    	Scanner scanner = new Scanner(System.in);
    	
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        scanner.close();

        try 
        {
            double result;
            switch (operator) 
            {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) 
                    {
                        throw new ArithmeticException("Division by zero is not allowed");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator");
            }
 
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
