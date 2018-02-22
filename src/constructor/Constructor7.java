package constructor;

class Constructor7
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.display();
		System.out.println("------------------");
		Student s2 = new Student("Sara",100,78.00);
		s2.display();
		
	}
}

class Student
{
	String name; int id; double perc;

	Student()
	{
		System.out.println("Student Object is Created");
	}

	Student(String name)
	{
		this(); // this is calling constructor method. by calling  " this() " Student() constructor will execute. 
		this.name = name;
	}

	Student(String name, int id)
	{	
		this(name);
		this.id = id;
	}

	Student(String name, int id, double perc)
	{	
		this(name,id);
		this.perc = perc;
		
	}

	void display()
	{
		System.out.println("Student name: " +name);
		System.out.println("Student ID: " +id);
		System.out.println("Student Percentage: "+perc);
	}
}
