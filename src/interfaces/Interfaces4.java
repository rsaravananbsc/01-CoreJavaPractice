package interfaces;

public class Interfaces4 
{

	public static void main(String[] args) 
	{
		Sample1 s = new Sample1();
		s.me();		
	}

}

interface A1
{
	default void me()
	{
		System.out.println(" Hello i am A ");
	}
	
	static void me2()
	{
		System.out.println(" Hello I am Static");
	}
}

interface B1
{
	default void me()
	{
		System.out.println(" Hello I am B");
	}
}

class Sample1 implements A1,B1
{

	@Override
	public void me() 
	{
		B1.super.me();
		System.out.println("-----------------------");
		A1.super.me();
	}
	
}

