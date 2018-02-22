package composed;

class  Composition1
{
	public static void main(String[] args) 
	{
		AddrInfo a1 = new AddrInfo( "India","Karnataka","Bangalore");
		AddrInfo a2 = new AddrInfo( "India","Karnataka","Bangalore");
		AddrInfo a3 = new AddrInfo( "India","TamilNadu","Chennai");
		
		Employee e1 = new Employee(100,"Sara", a1);
		Employee e2 = new Employee(100,"Sara", a2);
		Employee e3 = new Employee(100,"Sara", a3);
		e1.display();
	}
}

class Employee
{
	int eid;
	String ename;
	AddrInfo add;

	Employee(int eid, String ename, AddrInfo add)
	{
		this.eid = eid;
		this.ename = ename;
		this.add = add;
		
	}
	void display ()
	{
		System.out.println(ename +" " +eid +" " );
		add.display();
	}
}

class AddrInfo
{
	String country;
	String state;
	String city;

	AddrInfo(String country, String state, String city)
	{
		this.country = country;
		this.state = state;
		this.city = city;
	}

	void display()
	{
		System.out.println("Address: " +city +"," +state +"," +country);
	}
}
