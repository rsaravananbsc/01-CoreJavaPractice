package threads;

public class MultiThreadingConcept8 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Thread.currentThread().setName("Raghu");
		System.out.println(Thread.currentThread().getName());
		Thread2 t1 = new Thread2("Saravanan");
		Thread2 t2 = new Thread2("Santhosh");
		
		
		t1.start();
		t2.start();
		t1.setDaemon(true);
		Thread.sleep(500); //Throwing Error in Main Stack anyway T2 Stack will be execute. by this time DeadLock May occur. 
		//to avoid DeadLock have to be make Synchronization is required to Threads. This Exception is Unchecked Exception. 
		
		System.out.println(t1.isAlive());
	}
}

class Thread2 extends Thread
{

	public Thread2(String str) 
	{
		// TODO Auto-generated constructor stub
		super(str);
	}

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		super.run();
		for (int i = 1; i < 10; i++) 
		{
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}