package constructor;

class ParameterizedConstructor 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method Started");
		ParaCons pc1 = new ParaCons(10);	
		System.out.println( new ParaCons(20));
	}
}

class ParaCons
{
	ParaCons(int a)
	{
		System.out.println("I am a Constructor of Parameterized Constructor");
	}
}
