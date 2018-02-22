package methods;

class  CustomClassMethodStatic
{
	public static void main(String[] args) 
	{
		Student2 std1 = new Student2();
		std1.id = 123;
		std1.name = "Sara";
		std1.per = 98.04;

		std1.study();
		
	}
}

class Student2
{
	int id;
	String name;
	double per;

	void study()
	{
		System.out.println(name+" Is Studying");
	}
}