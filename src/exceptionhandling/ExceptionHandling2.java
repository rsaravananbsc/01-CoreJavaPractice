package exceptionhandling;

public class ExceptionHandling2 
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
		catch(Exception e)
		{
			System.out.println("Exception Occured");
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
		
				
		System.out.println("Main Method Ended");
	}
}
