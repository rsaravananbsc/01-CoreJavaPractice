package methods;
class  MethodExample2
{
	public static void main(String[] args) 
	{
		System.out.println("Main Class Method Started");
		SubMethod1.m();  // No Need to create Reference for Static Method to access other Sub-Class. Just ClassName.MethodName
	}
}

class SubMethod1
{
	static void m()
	{
		System.out.println("Sub-Class Method Started");
	}

}
