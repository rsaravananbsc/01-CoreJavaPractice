package inheritance;

class  Inheritance8 // Super() calling statement 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Class Started");
		//Simple s1 = new Simple(); // Error because of there is no Arguments.
		System.out.println("-----------------------");
		Simple s2 = new Simple(10); // This method calls first String Type constructor from Sample Class then execute Integer type constructor 
		//from Simple Class. because in Integer Constructor having super(String) calling statement of String
		System.out.println("-----------------------");
		Simple s3 = new Simple("Sara"); // This method calls first String Type constructor from Sample Class then execute Integer type constructor 
		//from Simple Class. because in Integer Constructor having super(String) calling statement of String
	}
}
class Sample
{
	// Since here No Arugs Constructor, we are getting Error due to super() calling statement was not mentioned. 
	// Even you mentioned super() calling statement with no args, Error will happen because there is no No Args Constructor.
	// When you need to access the Parameterized Constructor from Super Class, we can use Super() calling statement with Args (Int, String or any)
	Sample( )
	{
		System.out.println("I am No Type Construtor of Sample");
	}
	
	Sample( int a)
	{
		System.out.println("I am Integer Type Construtor of Sample");
	}

	Sample(String st)
	{
	System.out.println("I am String Type Construtor of Sample");
	}
}

class Simple extends Sample
{
	Simple( int a)
	{
		super("Sara");
		System.out.println("I am String Type Construtor of Simple");
	}

	Simple(String st)
	{
		super(10);
	System.out.println("I am String Type Construtor of Simple");
	}
}

