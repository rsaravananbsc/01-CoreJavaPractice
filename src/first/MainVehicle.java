package first;

public class MainVehicle {

	public static void main(String[] args) 
	{
		Volkswagen v1=new Volkswagen();
		v1.Run();
		v1.Type();
		v1.Made();
		System.out.println("===============");
		Car c1=new Volkswagen();
		c1.Run();
		c1.Type();
		System.out.println("===============");
		Vehicle ve=new Volkswagen();
		ve.Run();
		System.out.println("===============");
		Vehicle ve1=new Car();
		ve1.Run();
		System.out.println("===============");
	}
}

class Vehicle 
{
 void Run()
 {
	 System.out.println("Vehicle is Running");
 }
}

class Car extends Vehicle
{
	 void Run()
	 {
		 System.out.println("Car is Running");
	 }
	 void Type()
	 {
		 System.out.println("Car Type");
	 }
}

class Volkswagen extends Car
{
	 void Run()
	 {
		 System.out.println("Volkswagen is Running");
	 }
	 void Type()
	 {
		 System.out.println("Volkswagen Type");
	 }
	 void Made()
	 {
		 System.out.println("Germany Made");
	 }
}

