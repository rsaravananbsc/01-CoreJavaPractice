package exceptionhandling;

public class ExceptionHandle1 //OutOfMemoryError
{

	public static void main(String[] args) 
	{
		System.out.println("Main Method Started");
		double db[] = new double[300343434]; //This Error we can not handle because Physical memory not enough.
		System.out.println("Main Method Ended");
	}

}
