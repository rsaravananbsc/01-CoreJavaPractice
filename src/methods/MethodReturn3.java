package methods;
//Write a java program define a methods to check is even or odd.

class MethodReturn3
{
	public static void main(String args[])
	{
	 boolean yn = iseven (7);
	 System.out.println(" " +yn);	
	}
	
	static boolean iseven(int x)
	{
		int n=x;
		return (n%2==0);
	}
	
}