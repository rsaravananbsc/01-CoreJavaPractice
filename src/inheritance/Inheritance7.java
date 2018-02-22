package inheritance;

class Interitance7 //Super() Calling Statement Inheritance 
{
	public static void main(String[] args) 
	{
//		Test1 t1 = new Test1(); // This is calling Test1 No Arugs Constructor from Test1 Class
//		Test1 t2 = new Test1(10); // This is calling Test1 Integer Arugs Constructor from Test1 Class

		Test2 t3 = new Test2(); // This is calling, Test1 No Arugs Constructor from Test1 and Test2 No Arugs Constructor from Test2 Class, 
		// Because there is no this() or super() statements 
		Test2 t4 = new Test2(10); // This is calling, Test1 No Arugs Constructor from Test1 and Test2 Integer Arugs Constructor from Test2 Class
		// Because there is no this() or super() statements 
		Test2 t5 = new Test2("sara"); // This is calling, Test1 No Arugs Constructor from Test1 and Test2 String Arugs Constructor from Test2 Class
		// Because there is no this() or super() statements 
	}
}

class Test1
{
	Test1()
	{
		System.out.println("I am Test1 Construtor with NO Arguments");
	}

	Test1(int a)
	{
		System.out.println("I am Test1 Construtor with Integer Arguments");
	}

}

class Test2 extends Test1
{
	Test2()
	{
		System.out.println("I am Test2 Construtor with NO Arguments");
	}

	Test2(int a)
	{
		System.out.println("I am Test2 Construtor with Integer Arguments");
	}

	Test2(String st)
	{
		System.out.println("I am Test2 Construtor with String Arguments");
	}
}