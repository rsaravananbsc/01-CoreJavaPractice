package interfaces;

public class Interfaces3 
{
	public static void main(String[] args) 
	{
		Sample s = new Sample();
		s.me();
		A.me2();
	}
}

interface A
{
	default void me()
	{
		System.out.println(" Hello i am A ");
	}
	
	static void me2()
	{
		System.out.println(" I am Static");
	}
}

interface B
{
	default void me()
	{
		System.out.println(" Hello I am B");
	}
}

class Sample implements A,B
{
	public void me()
	{
		System.out.println(" Hello How are you");
	}
}
