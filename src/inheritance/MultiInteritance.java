package inheritance;

public class MultiInteritance  // Multiple Inheritance & Co-variant | UP Caste
{

	public static void main(String[] args) 
	{
		System.out.println("Main Class Started");
		C2 c1 = new C2();
		System.out.println(c1.x);
		System.out.println(c1.y);
		System.out.println(c1.z);
		c1.m1();
		c1.m2();
		c1.m3();
		System.out.println("--------------------------");
		B2 b1 = new C2();
		System.out.println(b1.x);
		System.out.println(b1.y);
		b1.m1();
		b1.m2();
//		b1.m3(); We can not access this M3 Method.
		System.out.println("---------------------------");
		A2 a1 = new C2();
		System.out.println(a1.x);
		a1.m1();

	}

}


class A2
{
	int x;
	void m1()
	{
		System.out.println("I am M1 Method");
	}
}

class B2 extends A2
{
	int x;
	int y;
	int z; 

	void m2()
	{

	}
}

class C2 extends B2
{
	int x;
	int y;
	int z; 

	void m3()
	{

	}
}

