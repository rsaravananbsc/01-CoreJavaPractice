package composed;

import java.util.*;
class  ComposedMethod
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Name:"); String name = sc.next();
		System.out.print("Enter the Age:"); int age = sc.nextInt();
		
		
		Class1 c1 = new Class1(name,age);
	}
}

class Class1
{
	String name; int age;
	Class1(String name, int age)
	{
		
		this.name = name;
		this.age = age;

		System.out.println("Name: " +name);
		System.out.println("Age: " +age);
		display();
		Class2 c2 = new Class2("Bangalore");
		c2.display();
	}

	void display()
	{
		System.out.println("Class 1 Details Has Been Invoked");
	}
}

class Class2
{
	String city;
	Class2(String city)
	{
	System.out.println("City: " +city);
	this.city = city;
	}

	void display()
	{
		System.out.println("Class2 Details Has Been Invoked");
	}
}
