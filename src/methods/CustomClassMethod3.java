package methods;

class CustomClassMethod3
{
	public static void main(String[] args) 
	{
		Student1 s1 = new Student1();
		s1.id =123;
		s1.name="Sarava";
		
		print(s1);
	}
	
	static void print(Student1 std) // Here passing the whole class into as types of input. "std" student variable. 
	{
		std.display();
	}
}

class Student1
{
	int id;
	String name;

	void display()
	{
		System.out.println(" " +id);
		System.out.println(" " +name);
	}
}