package threads;



public class MultiThreadingConcept4 
{
	public static void main(String[] args) 
	{
		class R1 implements Runnable
		{
			@Override
			public void run() 
			{
				for (int i = 0; i < 10; i++) 
				{
					System.out.println("JSPIDERS"+i);
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
		}
		
		class R2 implements Runnable
		{
			@Override
			public void run() 
			{
				for (int i = 0; i < 10; i++) 
				{
					System.out.println("QSPIDERS"+i);
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
		}
	
		Thread t1 = new Thread(new R1());
		Thread t2 = new Thread(new R2());
		
		t1.start();
		t2.start();
		
		new Thread(new Runnable() 
		{	
			@Override
			public void run() 
			{
				for (int i = 0; i < 10; i++) 
				{
					System.out.println("SARA"+i);
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		
				
	}
}

