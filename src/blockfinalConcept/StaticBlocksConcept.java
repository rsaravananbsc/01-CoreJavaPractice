package blockfinalConcept;

public class StaticBlocksConcept {

	static 
	{
		System.out.println("I am SIB of MAIN Class");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		System.out.println("-------------------------------");
		System.out.println("Main Method Started");
		
//		A a1 = new A();
		System.out.println("-------------------------------");
//		A a2 = new A();
		
		System.out.println("-------------------------------");
		B b1 = new B();
	}

}

class A
{
	static
	{
		System.out.println("I am a SIB of A");
	}
	
	A()
	{
		System.out.println("I am Constructor of Class A");
	}
}

class B extends A
{
	static
	{
		System.out.println("I am a SIB of B");
	}
	
	B()
	{
		System.out.println("I am Constructor of Class B");
	}
}
