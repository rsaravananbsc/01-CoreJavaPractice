package exceptionhandling;

public class ExceptionHandle3 //ArrayIndexOutOfBoundsException
{

	public static void main(String[] args) 
	{
		System.out.println("Main Method Started");
		int a[] = {10,20,30,40};
		System.out.println(a[0]);
		System.out.println(a[5]); 
		
		System.out.println("Main Method Ended");

	}
}