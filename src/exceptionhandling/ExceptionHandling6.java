package exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling6 //Nested Try...Catch.
{

	public static void main(String[] args) 
	{
		System.out.println("Main Method Started");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number:");  int a = sc.nextInt();
		System.out.println("Enter the Second Number:");  int b = sc.nextInt();

		try
		{
		double d = a/b; //Due to 0 can not devised hence Exception Error is Occurring
		System.out.println("The Answer is:" +d);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Enter Second  Value is invalid");
			System.out.println("Please Enter Non-Zero Value Again:");
			b = sc.nextInt();
			try
			{
			double d = a/b; //Due to 0 can not devised hence Exception Error is Occurring
			System.out.println("The Answer is:" +d);
			}
			catch(Exception e1)
			{
				System.out.println("Again You Entered Zero, So could not perform action");
			}
		}
			
		System.out.println("Main Method Ended");
	}
}
