package methods;
//Wtite a java program define a method to Biggest among three number.

class MethodReturn4
{
	public static void main(String args[])
	{
		int a =10, b=20, c=30, d=40,e=50;
	  	int bgn = bignum(bignum(a,b), bignum(c,d));
		System.out.println("Biggest No is:" +bgn);
	}
	
	static int bignum( int x, int y)
	{
		if (x>y)
		return x;
		else
		return y;		
	}
}