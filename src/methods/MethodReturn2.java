package methods;
//Write a java program to calculate the Factorial of N.

class MethodReturn2
{
	public static void main(String args[])
	{
		int f = fact(5);
		System.out.println("Factorial of 5 is: "+f);
	}
	
	static int fact(int x)
	{
		int fc=1;
		for (int i=1;i<=x;i++)
		{
			fc=fc*i;
		}
	return fc;
	}	
}