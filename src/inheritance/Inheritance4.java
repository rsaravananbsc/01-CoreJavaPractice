package inheritance;

class Inheritance4 //Multi-Level Inheritance
{
	public static void main(String[] args) 
	{
		Maruti obj = new Maruti(); // Object Created for Intermediate Class
			obj.VehicleType(); //Super Class members
			obj.Brand(); // Intermediate Class memers
			//obj.Speed(); // This Member we cant access because Sub-Class Object was not created. 
			System.out.println("---------------------");
			Maruti800 obj1 = new Maruti800(); //Object Created for Sub-Class hence we can access Intermediate & Super Class Members
			obj1.VehicleType(); //Super Class members
			obj1.Brand(); // Intermediate Class memers
			obj1.Speed(); //Sub Class Members
	}
}

class Car //Super Class
{
	public Car()
	{
		System.out.println("Class Car");
	}
	public void VehicleType()
	{
		System.out.println("Vechile Type: Car");
	}
}

class Maruti extends Car //Intermediate Class
{
	public Maruti()
	{
		System.out.println("Class Maruti");
	}
	public void Brand()
	{
		System.out.println("Brand : Maruti");
	}
}

class Maruti800 extends Maruti // Sub Class
{
	public Maruti800()
	{
		System.out.println("Class Maruti800");
	}
	public void VehicleType()
	{
		System.out.println("Vechile Model: Maruti800");
	}
	public void Speed()
	{
		System.out.println("Max:100/Kmph");
	}
}
