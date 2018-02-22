package abstraction;

public class Abstraction 
{
	public static void main(String[] args) 
	{
		Animal a1 = new Cat();
		a1.noise();
	
		Animal1 a2 = new Dog();
		a2.noise();
		
//		Animal a3 = new Animal(); // JVM Wont allows to create object to Abstracted Class 
	}
}

abstract class Animal
{
	void noise()
	{
	
	}
}

abstract class Animal1 
{
	abstract void noise();
	{
	
	}
}

class Cat extends Animal
{
	void noise()
	{
		System.out.println("Meow Meow");
	}
}

class Dog extends Animal1
{
	void noise()
	{
		System.out.println("Bow Bow");
	}
}