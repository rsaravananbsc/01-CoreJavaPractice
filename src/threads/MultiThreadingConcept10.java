package threads;

public class MultiThreadingConcept10  
{
	public static void main(String[] args) throws InterruptedException
	{
		Bank b = new Bank();
		
		Transaction1 t1 = new Transaction1(b);
		Transaction2 t2 = new Transaction2(b);
		t1.start(); 
		Thread.sleep(1000);
		t2.start();
	}
}

class Bank
{
	int balance=5000;
	
	synchronized void withdraw(int amt)
	{
		if(balance < amt)
		{
			System.out.println("Insuffient Balance");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(balance < amt)
		withdraw(amt);
		else
		{
			System.out.println("-------------------------------");
			System.out.println("Successfully Withdrawan:"+amt);
			this.balance = this.balance - amt;
			System.out.println("Available Balance:"+balance);
		}
	}
	
	synchronized void deposit(int amt)
	{
		this.balance = this.balance + amt;
		System.out.println("Successfully Despoited"+amt);
		System.out.println("Available Balance:"+balance);
		notify();
	}
	
}

class Transaction1 extends Thread
{
	Bank b;

	public Transaction1(Bank b) 
	{
		super();
		this.b = b;
	}

	@Override
	public void run() 
	{
		// Auto-generated method stub
		super.run();
		b.withdraw(7000);
	}
	
}

class Transaction2 extends Thread
{
	Bank b;

	public Transaction2(Bank b) 
	{
		super();
		this.b = b;
	}

	@Override
	public void run() 
	{
		// Auto-generated method stub
		super.run();
		b.deposit(3000);
	}
}

