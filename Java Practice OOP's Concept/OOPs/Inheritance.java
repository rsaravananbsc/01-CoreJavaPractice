package OOPs;

public class Inheritance {

	public static void main(String[] args) {
	
		Car c = new AudiA8();
		c.move();
		
	}
}

class Car 	
{
	void move()
	{
		System.out.println("Cars used to Move one Place to Another Place");
	}

}

class Audi extends Car // Single Inheritance  
{
	void move()
	{
		System.out.println("Audi Cars Move Faster");
	}
}

class AudiA8 extends Audi //MultiLevel Inheritance 
{
	void move()
	{
		System.out.println("Audi-A8 is fastested Card in Audi");
	}
}

class AudiA6 extends Audi //Hierarchical Inheritance 
{
	void move()
	{
		System.out.println("Audi-A8 is fastested Card in Audi");
	}
}

// Multiple Inheritance is not Support by Java.
//1. Inheritance is IS-A relationship. 

