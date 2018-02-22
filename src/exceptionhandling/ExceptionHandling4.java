package exceptionhandling;

public class ExceptionHandling4 //Finally Block Exception
{

	public static void main(String[] args) 
	{
		System.out.println("Main Method Started");
	
		try
		{
			String str = "1234A";
			int a = Integer.parseInt(str); //Converting String into Integer 
			System.out.println(a/0);
		}
		
		catch (Exception e) 
		{
			System.out.println("Exception Occured");
		}
		
		finally 
		{
			System.out.println("Finally Block Executed");
		}
		
	
	
	}

}
