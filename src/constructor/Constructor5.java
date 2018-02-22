package constructor;

class Constructor5 //Example for Difference of Datatype and Sequence of Parameter Overload
{
	public static void main(String[] args) 
	{
		System.out.println("Main Class Started");
		Employee e1 = new Employee("Sara",100);
		e1.display();
		Employee e2 = new Employee(102,"Sara");
		e2.display();
	}
}

class Employee
{
	String name;int id;

	Employee(String name, int id)
	{
		this.name = name;
		this.id = id;
	}

	Employee(int id, String name)
	{
		this.name = name;
		this.id = id;
	}

	void display()
	{
		System.out.println("Employee Name:" +name);
		System.out.println("Employee ID:" +id);

	}
}
