package methods;
class  MethodOverload1
{
	public static void main(String[] args) 
	{
		double a = add(10,20.25);
		double b = add(45.00, 12);
		System.out.println(" " +a);
		System.out.println(" " +b);
	}

	static double add(int a, double b)
	{
		System.out.println("Addition of Int & Double");
		return a+ b;
	}

	static double add(double a, int b)
	{
		System.out.println("Addtion of Double & Int");
		return a + b;
	}

}