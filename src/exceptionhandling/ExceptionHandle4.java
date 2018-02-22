package exceptionhandling;

public class ExceptionHandle4 //Number Format Exception
{

	public static void main(String[] args) 
	{
		System.out.println("Main Method Started");
		
//		String str = "1234";
//		int a = Integer.parseInt(str);
//		System.out.println(a+10);
		
		String str = "1234AA";
		int a = Integer.parseInt(str); //Converting String into Integer 
		System.out.println(a+10);
				
		System.out.println("Main Method Ended");

	}
}