package threads;

public class MultiThreadingConcept7 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Thread.currentThread().setName("Raghu");
		System.out.println(Thread.currentThread().getName());
		Thread1 t1 = new Thread1("Saravanan");
		Thread1 t2 = new Thread1("Santhosh");
		
//		t1.run();
		t1.start();
		t2.start();
	}
}


class Thread1 extends Thread
{

	public Thread1(String str) 
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