package casting;

public class UpDownCasting1 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{

		Vehicle v1 = new Car();
		Vehicle v2 = new Bike();
		
		Vehicle v = null;
		if(v instanceof Bike)
		{
			Bike b = (Bike)v;
		}
		if( v instanceof Car)
		{
			Car c = (Car)v;
		}
	
	}
}

class Vehicle
{
	int x =10;
	void m1()
	{
		System.out.println("I am M1 Method Vehicle");
	}
}

class Car extends Vehicle
{
	int y=20;
	void m2()
	{
		System.out.println("I am M2 Method of Car");
	}
}

class Bike extends Vehicle
{
	int z=30;
	void m3()
	{
		System.out.println("I am M3 Method of Bike");
	}
	
}
