package exceptionhandling;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionHandling16 
{

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age:");
		int age = sc.nextInt();
		try
		{
		if(age<18) throw new Election("Not Eligible to vote");
		else 
		System.out.println(age+ " Eligble to vote");
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}

	}

}

class Election extends Exception
{

	public Election() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Election(String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() 
	{
		return "Not Eligible to Vote";
	}
	
}
