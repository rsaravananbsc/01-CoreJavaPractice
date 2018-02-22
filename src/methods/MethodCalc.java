//Write a Java Program for airthmetic operations using Methods.
package methods;
class MethodCalc
{
	public static void main(String args[])
	{
		add(10,20);
		sub(10,20);
		mul(10,20);
		div(10,20);
	}
	
	static void add(int x, int y)
	{
		System.out.println("Addtion: " +(x+y));
	}
	
	static void sub(int x, int y)
	{
		System.out.println("Subtraction: " +(x-y));
	}
	
	static void mul(int x, int y)
	{
		System.out.println("Multipilication: " +(x*y));
	}
	
	static void div(int x, int y)
	{
		System.out.println("Division: " +(x/y));
	}
}