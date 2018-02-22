package methods;
class MethodOverload3 
{
	public static void main(String[] args) 
	{
		disp (10, 20.00);
		System.out.println("------------------");
		disp(20.00, 10);
		System.out.println("------------------");

//		disp(10,10); // Ambiguous to fetch methods. because both Int Type values
	
	}

	static void disp(int a, double b)
	{
		System.out.println("Integer & Double Type");
	}


	static void disp( double a, int b)
	{
		System.out.println("Double & Integer Typ");
	}
	
}
