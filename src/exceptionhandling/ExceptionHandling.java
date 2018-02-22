package exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling 
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
			System.out.println("Zero is Not Devisiable by Any Number, Please Enter Other Than Zero");
		}
	
		System.out.println("Main Method Ended");
		
	}

}
