package methods;
//Define a method to cound how many didits in your Series of No.

class MethodReturn5
{
	public static void main(String args[])
	{
		int a = 12345;
		int cnt = count(a);
		System.out.println("Count of " +a +" is: " +cnt);
	}
	
	static int count(int x)
	{
		int c=0;
		
		do
		{
			c++;
			x = x/10;
		} while (x!=0);
		
	return c;
	}
}