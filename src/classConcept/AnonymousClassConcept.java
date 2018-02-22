package classConcept;

public class AnonymousClassConcept 
{
	public static void main(String[] args) 
	{
		A a1 = new A() { 
			int x=25;
			
			void m1()
			{
				System.out.println("Hi Hello");	
			}
		};
		
		System.out.println(a1.a); //Here 6we can access A Because its A Class Type not referred to any class.
		a1.m1(); //Here can access A class methods. and prints Anonymous class methods. 
//		System.out.println(a1.x); //Here we cannot access X because its anonymous class.
		
		System.out.println(new A() { int x = 50;}.x); //Anonymous class member can access Directly like this. AnonymousClass.Members
		
		Object obj = new Object();
		System.out.println(obj); //Prints Fully Qualified name of Object Because its give toString Method by default.
		
		Object obj1 = new Object() {public String toString() {return "I am an Object";}}; //Here we Override the toString Method.
		
		System.out.println(obj1.toString()); //Prints I am an Object
 		
	}
}


class A
{
	int a=10;
	
	void m1()
	{
		System.out.println("I am M1 of A Class");
	}
}

class B extends A
{
	int b=20;
	
	void m1()
	{
		System.out.println("I am M1 in B Class");
	}
	
	void m2()
	{
		System.out.println("I am M2 of B Class");
	}
}