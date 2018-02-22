package threads;

public class MultiThreadingConcept3 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		t1.start();
		t2.start();
		Test t = new Test();
		t.run();
				
	}
}

class Test extends Thread
{
	@Override
	public void run() 
	{
		super.run();
		for (int i = 0; i < 10; i++) 
		{
			System.out.println("JSpider");
			try {
				Thread.sleep(1200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
