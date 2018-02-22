package methods;
class MethodOverload4 
{
	public static void main(String[] args) 
	{
		get(0, 0, 0);
		get1(0, 0, 0);
	}

	static void get(int a, int b, double c)
	{
		System.out.println("Double Type Return");
		
	}
	static void get1(int a, int b, double c)
	{
		System.out.println("Integer Type Return");
	}
}
