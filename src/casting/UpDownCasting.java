package casting;

public class UpDownCasting {

	public static void main(String[] args) 
	{
		Sample s1 = new Simple(); //UPCasting //If Super Class refer Sub Class, only Super Class Members are accessible. Not Sub Class 
		s1.m1(); 
		System.out.println(s1.a);
		System.out.println(s1.b);
		
		Simple s2 = (Simple)s1; //DownCasting // If Super Class Reference Referred by Sub Class Reference, can access Super Class & Sub Class Members and Overriding methods can also accessible
		System.out.println(s2.a);
		System.out.println(s2.b);
		System.out.println(s2.c);
		System.out.println(s2.d);
		s2.m1();
		s2.m2();
	
//		Simple s3 = new Sample(); // Sub Class Members can not refer to Super Class. by doing Casting we can  make it.
//		System.out.println(s3.a);
//		System.out.println(s3.b);
//		System.out.println(s3.c);
//		System.out.println(s3.d);
		
		Simple s3 = (Simple) new Sample(); // by Adding cast to Super Class we can achieve it. But Class Cast Exception Error will come.
		System.out.println(s3.a);
		System.out.println(s3.b);
		System.out.println(s3.c);
		System.out.println(s3.d);
	}
}

class Sample
{
	int a =10;
	int b=20;
	
	void m1()
	{
		System.out.println(" I am M1 Method");
	}
}

class Simple extends Sample
{
	int c=30;
	int d=40;
	
	void m2()
	{
		System.out.println("I am M2 Method");
	}
	
//	void m1()
//	{
//		System.out.println("I am M1 Method of Sub-Class");
//	}
}
