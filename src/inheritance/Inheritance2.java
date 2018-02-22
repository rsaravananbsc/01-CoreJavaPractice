package inheritance;

class Inheritance2 //Single Inheritance
{
	public static void main(String[] args) 
	{
		Cars4 c1 = new Cars4("Michalin", "RBK", "Wing", "Essilor", "Mesaratti", "Sport", 10000000, "Biral", "Rubix", "WingDoors", "Olaz");
		c1.carinfo();
		System.out.println();
		System.out.println("-------------------------------------------------------------------------");
		c1.carpartsdisplay();
	}
}

class SpareParts1 //Super Class
{

	String tyres, seats, doors, windshield;

	public SpareParts1(String tyres, String seats, String doors, String windshield) 
	{
		super();
		this.tyres = tyres;
		this.seats = seats;
		this.doors = doors;
		this.windshield = windshield;
	}


	void carpartsdisplay()
	{
		System.out.println("CARS MAJOR SPARES");
		System.out.println("-----------------");
		System.out.println("Tyres: "+tyres);
		System.out.println("Seats: "+seats);
		System.out.println("Doors: "+doors);
		System.out.println("Windsheild:"+windshield);								
	}
}

class Cars4 extends SpareParts1  //Sub Class of SpareParts Class
{
	String carbrand;
	String cartype;
	double carprice;
	String windshields;
	
	public Cars4(String tyres, String seats, String doors, String windshield, String carbrand, String cartype, double carprice, String tyres2, String seats2, String doors2, String windshields) 
	{
		super(tyres, seats, doors, windshield);
		this.carbrand = carbrand;
		this.cartype = cartype;
		this.carprice = carprice;
		this.windshields = windshields;
	}

	void carinfo()
	{
		System.out.println("OUR NEW MODEL CAR INFO");
		System.out.println("_____________________ ");
		System.out.println(" Car Brand:"+carbrand);
		System.out.println(" Car Type:"+cartype);
		System.out.println(" Car Price(Incl.Tax):"+carprice);
		System.out.print(" Car Features:"+"Tyres-"+tyres +"|" +" Seats-" +seats +"|" +" DoorsMode-"+doors +"|" +" Windshield-"+windshields);
	}
}
