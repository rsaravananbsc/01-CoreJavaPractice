package threads;

public class MultiThreadingConcept9  //Synchronization Concept.
{
	public static void main(String[] args)
	{
		Resource r1 = new Resource();
		
		Thread10 t1 = new Thread10(r1);
		Thread20 t2 = new Thread20(r1);
		t1.start(); t2.start();
	}
}

class Resource
{
	synchronized void print(int a) //Making Methods as Sync can avoid Deadlock. hence this Method dont share to all the Thread. 
	//Only one Thread can access executable methods at a time 
	{
		for (int i = 0; i < 26; i++) 
		{
			System.out.println((char)(a+i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Thread10 extends Thread
{
	Resource r1;

	public Thread10(Resource r1) 
	{
		super();
		this.r1 = r1;
	}

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		super.run();
		r1.print(65);
	}
	
}

class Thread20 extends Thread
{
	Resource r2;

	public Thread20(Resource r2) 
	{
		super();
		this.r2 = r2;
	}

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		super.run();
		r2.print(97);
	}
	
}

