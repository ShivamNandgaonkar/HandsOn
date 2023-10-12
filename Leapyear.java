package loops;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value:");
		
		int k=s.nextInt();
		
		if(k%400==0 && k%100==0 && k%4==0)
		{
			System.out.println("Leap year");

		}
		else if(k%100==0) 
		{
			System.out.println(" Not a Leap Year");
		}
		else if(k%400==0) 
		{
			System.out.println(" Not a Leap Year");
		}
		else if(k%4==0)
		{
			System.out.println("Not a leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
        s.close();

	}
}