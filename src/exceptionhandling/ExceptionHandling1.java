package exceptionhandling;

import java.util.*;

public class ExceptionHandling1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method Started");
		try
		{
		int a[] = {10,20,30,40};
		System.out.println(a[5]); 
		System.out.println(a[3]/0); 
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Arithemthic Exception Occured");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out of Bound Exception Occured");
		}
		
		System.out.println("Main Method Ended");
	}
}
