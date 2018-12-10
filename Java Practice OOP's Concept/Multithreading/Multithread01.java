package Multithreading;

public class Multithread01 extends MultiThread01{
	public static void main(String[] args) {
		MultiThread01 T1 = new MultiThread01();
		T1.start();
	}
}

class MultiThread01 extends Thread
{
	public void run()
	{
		System.out.println("Second Thread Running...");
	}
}

class MultiThread02 implements Runnable
{
	public void run()
	{
		System.out.println("Secoond Thread Running...");
	}
}