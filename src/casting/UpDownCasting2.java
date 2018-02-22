package casting;
public class UpDownCasting2
{

	public static void main(String[] args) 
	{
		Student s = new Student(123,"Sara",65.78);
		Employee e = new Employee(420,"Jesh",7888.0);
		Example ex = new Example();
		ex.display(s);
		System.out.println("----------------------------");
		ex.display(e);
	}

}

class Example
{
	void display(Object obj)
	{
	
		if(obj instanceof Student)
		{
			Student s1 = (Student)obj;
			System.out.println("Student ID:"+s1.id);
			System.out.println("Student Name:"+s1.name);
			System.out.println("Student Percentage:"+s1.per);
		}	
		else if(obj instanceof Employee)
		{
			Employee e1 = (Employee)obj;
			System.out.println("Student ID:"+e1.id);
			System.out.println("Student Name:"+e1.name);
			System.out.println("Student Percentage:"+e1.sal);
		}
		else 
		{
			System.out.println("None of the defined Classes are not referred");
		}
	}
	
}

class Student
{
	int id;
	String name;
	double per;
	
	public Student(int id, String name, double per) 
	{
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
}

class Employee
{
	
	int id;
	String name;
	double sal;
	public Employee(int id, String name, double sal) 
	{
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}	
}