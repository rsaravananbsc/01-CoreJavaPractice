package inheritance;

class  Inheritance1
{
	public static void main(String[] args) 
	{
		A a1 = new A(); //As we created object for Super Class, we could not access B Class members.
		System.out.println(a1.a);
		a1.m();

//		System.out.println(a1.b); // we cant access these members as we had created objects only for A Class. 
//		a1.n(); //We cant access this object.

		//Suggestion is needs to create Object for Sub-Class//

	}
}

class A
{
	int a=10;

	void m()
	{
		System.out.println("I am M of A Class");
	}
}

class B
{
	int b=20;
	void n()
	{
		System.out.println("I am N of B Class");
	}
}
