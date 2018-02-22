package methodoverridden;

public class MethodOverRidden2 
{

	public static void main(String[] args) 
	{
		Person a = new Male();
		a.gender();
		Person b = new Female();
		b.gender();
		
		Person c = new Person();
		c.gender();
	}

}

class Person
{
	void gender()
	{
		System.out.println("Person is Human");
	}
}

class Male extends Person
{
	void gender()
	{
		System.out.println("This Person is a Male");
	}
}

class Female extends Person
{
	void gender()
	{
		System.out.println("This Person is a Female");
	}
}