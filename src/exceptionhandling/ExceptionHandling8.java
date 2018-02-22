package exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling8 // Customized Exception. Throw Keyword
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method Started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age:"); double age = sc.nextDouble();
		
//		if(age<18)
//			throw new ArrayIndexOutOfBoundsException("Not Eligible to Vote");
//		throw new ArithmeticException("Eligible to Vote");
//		
//		System.out.println("Main Method Ended"); // This line is 100% unreachable because If Condition wrote for True & False.
//		//Post Condition Lines are not going to execute. In order to avoid have to put them into Try..Catch Block
		
		try
		{
			if(age<18)
				throw new ArrayIndexOutOfBoundsException("Not Eligible to Vote");
			throw new ArithmeticException("Eligible to Vote");
		}
		catch (Exception e) 
		{
//			System.out.println(e);
//			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
		}
		
		System.out.println("Main Method Ended");
	}
}
