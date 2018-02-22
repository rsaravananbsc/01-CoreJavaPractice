package packages.ObjectClass;

public class ToStringHashCodeEquals 
{
	public static void main(String[] args) 
	{
	
		Student s1 = new Student(10, "Sara", 78.5);
		System.out.println(s1.toString());
		System.out.println(s1.hashCode());
		System.out.println(s1.equals(s1));
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
	
	public String toString()
	{
		return name = "Lara";
	}
	
	public int hashCode()
	{
		return id = 100;
		
	}
	
	public boolean equals(Object obj)
	{
		if( obj instanceof Student)
		{
			Student s2 =(Student) obj;
			return this.id == s2.id && this.name == s2.name && this.per == s2.per;
		}
		else 
			return false;
	}
}


