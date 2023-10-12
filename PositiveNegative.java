package loops;

import java.util.*;;
	public class PositiveNegative 
	{

		public static void main(String[] args)
		{
			//scanner class object
			Scanner s=new Scanner(System.in);
			System.out.println("Enter a number:");
			
			//user input
			int num=s.nextInt();
			
			// Check if the number is positive or negative
			if(num>0)
			{
				System.out.println("Number is positive");
			}
			else if(num<0)
			{
				System.out.println("Number is negative");
			}
			else
			{
				System.out.println("Number is 0");
			}
			s.close();
		}

	
	
	}

	
