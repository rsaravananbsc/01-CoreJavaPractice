package threads;

public class MultiThreadingConcept5 
{
	public static void main(String[] args) 
	{
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
		
		Thread t1 = new Thread();
		Thread t2 = new Thread("Saravanan");
		Thread t3 = new Thread(new R2());
		Thread t4 = new Thread(new R2(),"Santhosh");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t3.getName());
		System.out.println(t4.getName());
		t3.setName("Test");
		System.out.println(t3.getName());
		System.out.println("-----------------------");
		System.out.println(t1.getId());
		System.out.println(t2.getId());
		System.out.println(t3.getId());
		System.out.println(t4.getId());
		System.out.println("-----------------------");
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		System.out.println(t4.getPriority());
		System.out.println("-----------------------");
		t1.setPriority(10); // Max Priority 
		System.out.println(t1.getPriority());
//		t2.setPriority(12); // Priority Range is 1-10 Only
//		t3.setPriority(15); // Priority Range is 1-10 Only

		
		t2.setPriority(Thread.MAX_PRIORITY); //Default takes 10 as Max Priority.
		t3.setPriority(Thread.MIN_PRIORITY); //Default takes 1 as Min Priority.
		t4.setPriority(Thread.NORM_PRIORITY); //Default takes 5 as Normal Priority.
		System.out.println("-----------------------");
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		System.out.println(t4.getPriority());
 		
		
	}
}

