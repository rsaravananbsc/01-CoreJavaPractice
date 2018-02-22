package exceptionhandling;

public class ExceptionHandling7 // Customized Exception. Throw Keyword
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method Started");
		int a = 20;
		System.out.println("A Value is:"+a);
		
		
		if(a<10) //When this condition became true then only Throw exception will Execute. 
		throw new  NullPointerException();
		
		System.out.println("Main Method Ended");
			
	}
}
