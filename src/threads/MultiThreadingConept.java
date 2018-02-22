package threads;

public class MultiThreadingConept  //MultiThreading Not Declared.
{
	public static void main(String[] args)
	{
		System.out.println("Main Method Started");
		Sample s1 = new Sample();
		s1.m1();
		System.out.println("-----");
		s1.m2();
		System.out.println("Main Method Ended");
		
	}
}

class Sample
{
	void m1()
	{
		for (int i = 0; i < 10; i++) 
		{
			System.out.println((char)(i+65));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //Sleep methods throws exception, so have to propagate exception to super class or have to handle it here with try and catch.
		}
	}
	
	void m2()
	{
		for (int i = 0; i < 10; i++) 
		{
			System.out.println((char)(i+97));
			try {
				Thread.sleep(500,345); // Here 500 is MilliSeconds 345 is Nano Seconds.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //Sleep methods throws exception, so have to propagate exception to super class or have to handle it here with try and catch.
		}
		
	}
}
