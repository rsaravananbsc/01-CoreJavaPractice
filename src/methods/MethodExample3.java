package methods;
class  MethodExample3
{
	public static void main(String[] args) 
	{
		System.out.println("Main Class Method Started");
		m(); // Just use the Static Method Name M to access any method within a Main Class
	}

	static void m()
	{
		System.out.println("Method Started");
	}
}
