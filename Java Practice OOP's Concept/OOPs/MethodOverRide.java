package OOPs;

public class MethodOverRide {

	public static void main(String[] args) {
	
	Animals a = new Dogs();
	a.sound("dog");
	
	Animals a1 = new Cats();
	a1.sound("c");
	
	Animals a2 = new Animals();
	a2.sound("y");

	}
}

class Animals
{
	public void sound(String x)
	{
		System.out.println("Animals Can Make Noise");
	}
}

class Dogs extends Animals    
{
	public void sound(String x)
	{
		System.out.println("Dog Make Bow Bow Noise");
	}
}

class Cats extends Animals
{
	public void sound(String x)
	{
		System.out.println("Cats Makes Meow Meow Noise");
	}
}

//0. Same Methods name with Same Signature but present of subclass we can achieve Method Override.
//1. Method overriding is used to provide specific implementation of a method that is already provided by its super class.
//2. Method overriding is used for runtime polymorphism
//3. Method must have same name as in the parent class.
//4. Method must have same parameter as in the parent class.
//5. Must be IS-A relationship (inheritance).


