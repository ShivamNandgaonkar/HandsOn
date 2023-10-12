package loops;
import java.util.Scanner;

public class GradeCalculator {
	
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your numerical grade (0-100): ");
	        int grade = scanner.nextInt();

	        if (grade >= 0 && grade <= 100) {
	            String letterGrade;

	            switch (grade / 10) {
	                case 10:
	                case 9:
	                    letterGrade = "A";
	                    break;
	                case 8:
	                    letterGrade = "B";
	                    break;
	                case 7:
	                    letterGrade = "C";
	                    break;
	                case 6:
	                    letterGrade = "D";
	                    break;
	                default:
	                    letterGrade = "F";
	                    break;
	            }

	            System.out.println("Your letter grade is: " + letterGrade);
	        } else {
	            System.out.println("Invalid grade entered. Please enter a grade between 0 and 100.");
	        }

	        scanner.close();
	    }
	}

