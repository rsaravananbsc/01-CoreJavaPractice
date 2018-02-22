package abstraction;

public class Abstraction5 
{
	public static void main(String[] args) 
	{
		
		Demo2 d1 = new Demo2();
		d1.m1();
		
		
	}

}

abstract class Demo1
{
	abstract void m1();
	{
		System.out.println("Test");
	}
}

class Demo2 extends Demo1
{
	void m1() 
	{
		System.out.println("I am Demo2 M1 Method, and Overrid Demo1 M1 Method");
	}
}