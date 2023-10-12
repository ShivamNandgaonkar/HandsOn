package loops;

import java.util.Scanner;

public class nestedif2 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value:");
		
		int o=s.nextInt();
		
		if(o%2==0 && o%3==0)
		{
			System.out.println("Divisible by 2 and 3");

		}
		else if(o%2==0) 
		{
			System.out.println("Divisible by 2");
		}
		else if(o%3==0) 
		{
			System.out.println("Divisible by 3");
		}
		else
		{
			System.out.println("Number is not divisible by 2 and 3");
		}
		s.close();
		}


	}


