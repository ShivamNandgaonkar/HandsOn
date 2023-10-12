package loops;
import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        System.out.println("Choose the conversion type:");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Kelvin");
        System.out.println("3. Rankine");
       

        int choice = scanner.nextInt();

        double result;

        switch (choice) {
            case 1:
                result = celsiusToFahrenheit(celsius);
                System.out.println("Temperature in Fahrenheit: " + result);
                break;
            case 2:
                result = celsiusToKelvin(celsius);
                System.out.println("Temperature in Kelvin: " + result);
                break;
            case 3:
                result = celsiusToRankine(celsius);
                System.out.println("Temperature in Rankine: " + result);
                break;
           
            default:
                System.out.println("Invalid choice. Please choose a valid conversion type.");
        }
        
        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double celsiusToRankine(double celsius) {
        return (celsius + 273.15) * 9 / 5;
    }

    
    }

