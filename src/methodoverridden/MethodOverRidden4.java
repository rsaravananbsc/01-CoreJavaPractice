package methodoverridden;

public class MethodOverRidden4 
{

	public static void main(String[] args) 
	{
		Car c1 = new Audi();
		c1.run1();
		c1.run();
	}

}

class Vehicle
{
	void run()
	{
	System.out.println("Vehicle is Running");
	}
}

class Car extends Vehicle
{
	void run1()
	{
		System.out.println("Car is Running");
	}
}

class Audi extends Car
{
	void run2()
	{
	System.out.println("Audi Car is Running");
	}
}
