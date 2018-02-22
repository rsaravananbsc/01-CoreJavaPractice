package methodoverridden;

public class MethodOverRidden3 // Final Keyword 
{

	public static void main(String[] args) 
	{
		System.out.println("Main Class Started");
		B b1 = new B();
		b1.m1();
	}

}

class A
{
	void m1()
	{
		System.out.println("I am M1 method of Class A");
	}
	
	//final void m1()
	//{
		//System.out.println("I am M1 method of Class A");
	//}
}

class B extends A
{
	void m1()
	{
		System.out.println("I am M2 method of Class B");
	}
}
