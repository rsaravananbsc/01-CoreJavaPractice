package others;
//Write a Java Program calculcate Sum of Multiple of 5's.

class Multiof5
{
	public static void main (String args[])
	{
	int sum =0, n=20;
	for (int i =0; i<=n; i =i+5)
	{
		sum = sum + i;
		System.out.println("Sum of "+n +"Value is: " + sum);
	}
	}
}