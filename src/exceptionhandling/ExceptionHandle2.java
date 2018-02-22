package exceptionhandling;

public class ExceptionHandle2 //ArithmeticException
{

	public static void main(String[] args) 
	{
		System.out.println("Main Method Started");
		int a=5; int b=0;
		double d = a/b; //Due to 0 can not devised hence Exception Error is Occurring
		System.out.println(d);
		System.out.println("Main Method Ended");
	}

}
