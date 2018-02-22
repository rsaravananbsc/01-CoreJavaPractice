package constructor;

class Constructor6 //Example for No.of Args, No.of Differ DataType, Sequence of Args Constructor Overload
{
	public static void main(String[] args) 
	{
		System.out.println("Main Class Started");
		Product e1 = new Product("Pen",10);
		e1.display();
		Product e2 = new Product(102,"Marker");
		e2.display();
	}
}

class Product
{
	String name;int id;

	Product(String name, int id)
	{
		this.name = name;
		this.id = id;
	}

	Product(int id, String name)
	{
		this.name = name;
		this.id = id;
	}

	void display()
	{
		System.out.println("Employee Name:" +name);
		System.out.println("Employee ID:" +id);
		System.out.println("--------------");

	}
}
