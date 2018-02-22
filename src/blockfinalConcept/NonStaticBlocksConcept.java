package blockfinalConcept;

public class NonStaticBlocksConcept 
{
	static
	{
		System.out.println("------------------------------------------");
		System.out.println("I am SIB of Main Class");
		System.out.println("------------------------------------------");
	}
	public static void main(String[] args) 
	{
		System.out.println("1.------------------------------------------");
		new A1(); // IIB will execute depends upon Objection creation. How many Object created , that much time IIB Block get execute.
		System.out.println("2.------------------------------------------");
		new Ex2();
		System.out.println("3.------------------------------------------");
		new B1(10);
		System.out.println("4.------------------------------------------");
		new Example1();
	}
}

class A1
{
	{
		System.out.println("I am IIB of A Class Statements");
	}
	
	A1()
	{
		System.out.println("I am Constructor of A Class");
	}
}

class B1
{
	{
		System.out.println("I am IIB of B Class Statements");
	}
	
	B1()
	{
		System.out.println("I am Constructor of B Class");
	}
	
	B1(int a)
	{	
		this();
		System.out.println("I am Integer Type Constructor of B Class");
	}
}

class Ex1
{
	{
		System.out.println("I am IIB of Ex1 Class");
	}
}

class Ex2 extends Ex1
{
	{
		System.out.println("I am IIB of Ex2 Class");
	}
}

class Example1 extends Example
{
	static
	{
		System.out.println("I am SIB of Example1 Class ");
	}
	{
		System.out.println("I am IIB of Example1 Class");
	}
	Example1()
	{
		System.out.println("I am No Arg Constructor of Example1");
	}
	Example1(int a)
	{
		System.out.println("I am Int Type Constructor of Example1");
	}
}

class Example
{
	static
	{
		System.out.println("I am SIB of Example Class");
	}
	
	{
		System.out.println("I am IIB of Example Class");
	}
	
	public Example() 
	{
		System.out.println("I am No Arg Constructor of Example Class");
	}
}

