package abstraction;

public class Abstraction1 
{

	public static void main(String[] args) 
	{
		Simple s1 = new Simple(); // If Sub Class refer a Sub Class Object, we can access SubClass Members as well Super Class Members
		s1.m1();
		s1.m2();
		s1.m3();
		
		Sample s2 = new Simple(); 	//If Super Class refer a Sub Class Object, we can access only Super Class Members,
									//Sub Class Abstracted Members Only
		s2.m1();
		s2.m2();
		
//		Sample s3 = new Sample(); // We can not create Object for Sample class because its a Abstracted Class. 
	}

}

abstract class Sample 
{
	void m1()
	{
		System.out.println("I am M1 Method of Sample Class");
	}
	
	abstract void m2();
}


class Simple extends Sample
{
	void m3()
	{
		System.out.println("I am M3 Method of Simple Class");
	}
	
	void m2()
	{
	
	}
}