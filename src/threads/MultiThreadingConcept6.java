package threads;

public class MultiThreadingConcept6 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.out.println("Main Methods Started");
		Thread t1 = new Thread(new R1());
		Thread t2 = new Thread(new R2());
		Thread t3 = new Thread(new R3());
		
		t1.suspend();
		Thread.sleep(500);
		t2.start();
		t1.resume();
		t1.start();
		
		t1.notify();
		System.out.println("Main Methods Ended");
 		
		
	}
}


class R1 implements Runnable
{
	@Override
	public void run() 
	{
		for (int i = 1; i < 10; i++) 
		{
			System.out.println("R1-Thread-"+i);
		}
		
	}
	
}

class R2 implements Runnable
{
	@Override
	public void run() 
	{
		for (int i = 1; i < 10; i++) 
		{
			System.out.println("R2-Thread-"+i);
		}
		
	}
	
}

class R3 implements Runnable
{
	@Override
	public void run() 
	{
		for (int i = 1; i < 10; i++) 
		{
			System.out.println("R3-Thread-"+i);
		}
		
	}
	
}
