package inheritance;

class Inheritance9
{
	public static void main(String[] args) 
	{
		Student s1 = new Student("Sarava",28,102,"CSE",78.8);
		s1.display();
	}
}

class Person
{
	String name;
	int age;

	Person(String name, int age)
	{
		this.name = name;
		this.age =age;
	}

	void dispinfo()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}

class Student extends Person
{
	int sid;
	String stream;
	double per;

	Student(String name, int age, int sid, String stream, double per)
	{
		super(name,age);
		this.sid = sid;
		this.stream = stream;
		this.per = per;
	}
	
	void display()
	{
		dispinfo();
		System.out.println("Student ID:"+sid);
		System.out.println("Student Stream:"+stream);
		System.out.println("Student Percentage:"+per);
	}
}