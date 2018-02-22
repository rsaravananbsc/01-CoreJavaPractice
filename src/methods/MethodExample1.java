package methods;
class  MethodExample1
{
	public static void main(String[] args) 
	{
		System.out.println("Main Class Method Started");
		SubMethod m1 = new SubMethod();
//		SubMethod.m(); // Non-Static M Method cant be use without reference on Main Method Class
		m1.m();
	}
}

class SubMethod
{
//	System.out.println("Sub-Class Started");

	void m()
	{
		System.out.println("Sub-Class Method Started");
	}
}
