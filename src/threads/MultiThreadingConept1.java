package threads;

public class MultiThreadingConept1 //Implements MultiThread Concept.
{
	public static void main(String[] args)
	{
		System.out.println("Main Method Started");
		Sample s1 = new Sample();
		
		class T1 extends Thread
		{
			@Override
			public void run()
			{
				super.run();
				s1.m1(); //Whatever Task you want to perform should be implement inside run Method. 
			}	
		}
		
		class T2 extends Thread
		{
			@Override
			public void run()
			{
				super.run();
				s1.m2(); //Whatever Task you want to perform should be implement inside run Method. 
			}	
		}
		
		T1 t1 = new T1(); //Creating Execution Path
		T2 t2 = new T2(); //Creating Execution Path
		
		t1.start(); t2.start();
		
		System.out.println("Main Method Ended");

	}
}

class Sample1 
{
	void m1() throws InterruptedException
	{
		for (int i = 0; i < 10; i++) 
		{
			System.out.println((char)(i+65));
			Thread.sleep(1000);
		}
	}
	
	void m2() throws InterruptedException
	{
		for (int i = 0; i < 10; i++) 
		{
			System.out.println((char)(i+97));
			Thread.sleep(500,345); // Here 500 is MilliSeconds 345 is Nano Seconds.
			
		}
		
	}
}
