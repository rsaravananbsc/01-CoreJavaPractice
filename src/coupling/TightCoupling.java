package coupling;

public class TightCoupling // Fixed Methods Implementation is called Tight Coupling
{
	public static void main(String[] args) 
	{
		Travel t1 = new Travel();
		t1.StartJourney();
		
		Travel t2 = new Travel();
		t2.StartJourney();
	}

}

class Travel
{
	Car car = new Car();
	void StartJourney()
	{
		car.go();
	}
}

class Car
{
	void go()
	{
		System.out.println("Travel by Car");
	}
}
