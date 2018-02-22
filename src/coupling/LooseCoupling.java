package coupling;

public class LooseCoupling 
{
	public static void main(String[] args) 
	{
		Travel1 t1 = new Travel1();
		t1.SetVehicle(new Car1());
		t1.StartJourney();
		
		
		t1.SetVehicle(new Bike1());
		t1.StartJourney();
	}
}
class Travel1
{
	Vehicle v;	
	
	void SetVehicle(Vehicle v)
	{
		this.v = v;
	}
	
	void StartJourney()
	{
		v.go();
	}
}

interface Vehicle
{
	public void go();
}

class Car1 implements Vehicle
{
	public void go()
	{
		System.out.println("Travle by Car");
	}
}

class Bike1 implements Vehicle
{
	public void go()
	{
		System.out.println("Travel by Bike");
	}
}