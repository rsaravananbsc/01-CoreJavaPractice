package exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling5 //Nested Try..Catch 
{

	public static void main(String[] args) 
	{
		System.out.println("Main Method Started");
		
		Scanner sc = new Scanner(System.in);
		int a=0; int b=0;
		
		try
		{
			System.out.println("Enter A & B Value");
			try
			{
				System.out.println("Enter the First Integer Value:");
				a = Integer.parseInt(sc.next());
			} 
			catch (Exception e) 
			{
				System.out.println("Entered value is not Integer Tyep");
			}
			
			try
			{
				System.out.println("Enter the Second Integer Value:");
				b = Integer.parseInt(sc.next());
			}
			catch (Exception e) 
			{
				System.out.println("Entered Value is not Integer Tyep");
			}
			
			System.out.println("Sum is:"+(a+b));
		}
		catch (Exception e) 
		{
			System.out.println("Exception Occured");
		}		
	
		System.out.println("Main Method Ended");
	
	
	}

}
