package inheritance;

class Inheritance3 //Hierarchical Inheritance
{
	public static void main(String[] args) 
	{
//		Vehicle v1 = new Vehicle("4-Wheeler","Audi");
//		Cars c1 = new Cars("Quintoo","Luxurary",10000000);
//		Bikes b1 = new Bikes("Duke", "Racing",560000);
//		c1.vehicleinfo();
//		System.out.println("---------------------------");
//		Vehicle v2 = new Vehicle("2-Wheeler","Audi");
//		Bikes b2 = new Bikes("Bike", "Duke", "390RR", "Super-Racing", 150000);
//		b2.vehicleinfo();
		
		Vehicle v1 = new Vehicle("Car", "Mesaratti");
		//v1.vehicleinfo();
		
		Cars1 car = new Cars1("Car", "Audi", "RR1700", "Race", 24000000);
		car.vehicleinfo();
		
		Bikes bike = new Bikes("Bike", "Duke", "RR390", "Race", 250000);
		bike.vehicleinfo();
		
//		Cars1 car = new Cars1("Car","Mesaratti","Quintoo","Super-Race",100000000);
//		car.vehicleinfo();
	}
}

class Vehicle // Super Class
{
	String vehicletype;
	String vehiclebrand;
	
	Vehicle(String vehicletype, String vehiclebrand)
	{
		this.vehicletype = vehicletype;
		this.vehiclebrand = vehiclebrand;
	}
		void vehicleinfo()
		{
			System.out.println(" Vehicle Type:"+vehicletype);
			System.out.println(" Vehicle Brand:"+vehiclebrand);
		}
}

class Cars1 extends Vehicle // Sub Class of Vehicle Class
{
	String carmodel;
	String cartype;
	double carprice;
	
	public Cars1(String vehicletype, String vehiclebrand, String carmodel, String cartype, double carprice) 
	{
		super(vehicletype, vehiclebrand);
		this.carmodel = carmodel;
		this.cartype = cartype;
		this.carprice = carprice;
	}


	void vehicleinfo()
	{
		System.out.println(" Vehicle Type:"+vehicletype);
		System.out.println(" Vehicle Brand:"+vehiclebrand);
		System.out.println(" Car Model:" +carmodel);
		System.out.println(" Car Type(Luxuary/Normal):" +cartype);
		System.out.println(" Car Price:" +carprice);
	}
} 

class Bikes extends Vehicle // Sub Class of Vehicle Class
{
	String bikemodel;
	String biketype;
	double bikeprice;
	
	public Bikes(String vehicletype, String vehiclebrand, String bikemodel, String biketype, double bikeprice) 
	{
		super(vehicletype, vehiclebrand);
		this.bikemodel = bikemodel;
		this.biketype = biketype;
		this.bikeprice = bikeprice;
	}

	void vehicleinfo()
	{
		System.out.println(" Vehicle Type:"+vehicletype);
		System.out.println(" Vehicle Brand:"+vehiclebrand);
		System.out.println(" Bike Model:" +bikemodel);
		System.out.println(" Bike Type(Luxuary/Normal):" +biketype);
		System.out.println(" Bike Price:" +bikeprice);
	}

}
