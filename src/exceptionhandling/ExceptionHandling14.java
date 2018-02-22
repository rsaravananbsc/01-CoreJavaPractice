package exceptionhandling;

public class ExceptionHandling14 // User-Define Exception 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Main Method Started");
		
		int a=1;
		
		try 
		{
			throw new ExceptionTest(a);
		} 
		catch (ExceptionTest e)
		{
			System.out.println(a);
		}
		
							
		System.out.println("Main Method Ended");
			                        
	}
}

class ExceptionTest extends Exception
{
	int a;

	public ExceptionTest(int a) 
	{
		super();
		this.a = a;
		if(a>10)
			System.out.println("Test");
	}
	
	public int ExceptionTestString()
	{
		return a;
	}
	
}
