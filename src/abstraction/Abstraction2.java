package abstraction;

public class Abstraction2 
{
	public static void main(String[] args) 
	{
		Test3 t = new Test3();
		t.m1();
		t.m2();
		t.m3();
		t.m4();
		
	}

}

abstract class Test1
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	public void getAddtion() {
		// TODO Auto-generated method stub
		
	}
	
}

//class Test2 extends Test1 // Stills This line showing Error because all of the Super Class Abstracted Methods are not implemented in Sub-Class
//{
//	void m1()
//	{
//		
//	}
//}

abstract class Test2 extends Test1 //So we can make this class as Abstract.
{
	void m1() 
	{
		System.out.println(" I am M1 Method of Test2");
	}
}

class Test3 extends Test2 // Here Error is not showing, because all of super class abstracted methods are defined in sub class. 
{
	void m2()
	{
		System.out.println(" I am M2 Method of Test3");
	}
	
	void m3()
	{
		System.out.println(" I am M3 Method of Test3");
	}
	
	void m4()
	{
		System.out.println("I am M4 methods of Test3");
	}
}