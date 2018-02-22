package abstraction;

public class Abstraction6 
{
	public static void main(String[] args) 
	{
		
		Test22 t1 = new Test22();
		t1.m1();

	}

}

abstract class Test11
{
	Test11()
	{
		System.out.println("I am Constructor of Test11");
	}
	
	abstract void m1();
	
	void m2()
	{
		System.out.println("---------------------------");
	}
}

class Test22 extends Test11
{
	Test22()
	{
		System.out.println("I am Consructor of Test22");
	}

	void m1()
	{
		m2();
		super.m2();
		System.out.println("I am an overload method of Test11");
	}
	
	void m2()
	{
		System.out.println("******************************");
	}
}
