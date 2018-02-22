package exceptionhandling;

public class ExceptionHandle6 //NullPointer Exception
{

	@SuppressWarnings("null")
	public static void main(String[] args) 
	{
		System.out.println("Main Method Started");
		
//		Object obj;
//		System.out.println(obj.hashCode());
		
		Object obj1 = null; 
		System.out.println(obj1.hashCode());
		
		System.out.println("Main Method Ended");

	}
}