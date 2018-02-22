package constructor;

class  DefaultConstructor
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method Started");
		Simple2 s1 = new Simple2();
		Simple2 s2 = new Simple2();
						  new Simple2 ();
		System.out.println(s1.a);
		System.out.println(s2.a);
		System.out.println(new Simple2().a);
		
	}
}

class Simple2
{
	int a;
	Simple2() // No Args Constructor 
	{
		System.out.println("I am a simple Constructor");
		a = 120;
	}
}