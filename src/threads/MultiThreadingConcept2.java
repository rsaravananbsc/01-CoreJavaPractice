package threads;

public class MultiThreadingConcept2 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread() //Creating Thread with No Arguments Constructor.
		{

			@Override
			public void run() 
			{
				// TODO Auto-generated method stub
				super.run();
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
			
		};
		
		Thread t2 = new Thread() 
		{
			public void run()
			{
				// TODO Auto-generated method stub
				super.run();
				for (int i = 0; i < 10; i++) 
				{
					System.out.println("QSPIDERS"+i);
					try {
						Thread.sleep(800);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		t1.start();
		t2.start();
				
	}
}

