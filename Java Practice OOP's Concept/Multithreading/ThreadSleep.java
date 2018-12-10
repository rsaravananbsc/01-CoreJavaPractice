package Multithreading;

public class ThreadSleep {
	
	public static int MAX_PRIORITY;
	public static int MIN_PRIORITY;
	public static int NORM_PRIORITY;
	
	public static void main(String[] args) throws InterruptedException {
		SleepThread ST1 = new SleepThread();
		SleepThread ST2 = new SleepThread();	
		SleepThread ST3 = new SleepThread();
		
	
		ST1.start();
		ST1.join();
		
		ST2.start();
		ST3.start();
		
		System.out.println("ST1 ID: "+ST1.getId());
		System.out.println("ST1 NAME: "+ST2.getName());
		System.out.println("ST1 PRIORITY: "+ST3.getPriority());
		
		ST1.setPriority(MIN_PRIORITY);
		ST2.setPriority(MAX_PRIORITY);
	
		
	}
}

class SleepThread extends Thread
{
	public void run() {
//		for(int i=1;i<10;i++){  
//		    try{Thread.sleep(500);}
//		    catch(InterruptedException e){System.out.println(e);}  
//		    System.out.println(i);  
//		}  
		
		System.out.println("running thread name is:"+Thread.currentThread().getName());  
		System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
	}
}
