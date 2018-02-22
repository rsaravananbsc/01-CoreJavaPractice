package methodoverridden;

import java.util.Scanner;

public class MethodOverRidden1 
{

	public static void main(String[] args) 
	{
		Animal ani = null;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Chose for 1.Cat 2.Dog:");
		int ch =sc.nextInt();
		
		if (ch==1)
			ani = new Cat(); 
		else
			ani = new Dog();
		
		ani.noise();
	}
	
}

class Animal
{
	void noise()
	{
	System.out.println("Animal Makes Noise");
	}
}

class Cat extends Animal
{
	void noise()
	{
		System.out.println("Cat Makes Meow Meow Noise");
	}
}

class Dog extends Animal
{
	void noise()
	{
		System.out.println("Dog Makes Bow Bow Noise");
	}
}
