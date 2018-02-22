package first;

public class MainAnimal 
{
	public static void main(String[] args) 
	{
		
		Animal a1=new Animal();
		a1.eat();
		System.out.println("=================");
		Dog d1=new Dog();
		d1.eat();
		System.out.println("=================");
		Animal a2=new Dog();
		a2.eat();
	}
}

class Animal 
{
	public void eat()
	{
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal
{
	public void eat()
	{
		System.out.println("Dog is eating");	
	}
}