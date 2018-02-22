package constructor;

class Constructor4 // Example of Different passing arguments of Constructor.
{
	public static void main(String[] args) 
	{
		System.out.println("Main Class Started");
		Simple1 s1 = new Simple1();
		Simple1 s2 = new Simple1(10);
		Simple1 s3 = new Simple1(10,20); 
						  new Simple1 (89.00); //De-Referential Object
		Simple1 s4 = new Simple1(35.00);
		Simple1 s5 = new Simple1 ('S');
		
	}
}

class Simple1
{
	Simple1()
	{
		System.out.println("I Am No args Constructor");
	}

	Simple1(int a)
	{
		System.out.println("I Am Int Single Type args Constructor");
	}
	
	Simple1(int a, int b) // by the difference of variable wont affect the overloading of constructor.
	{
		System.out.println("I Am Int Double Type args Constructor");
	}
	
	Simple1(double a)
	{
		System.out.println("I Am Double Single Type args Constructor");
	}
}
