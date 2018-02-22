package others;
//Write a Java Program to Calculate the Sum of Even No and Off No.

class SumEvenOdd
{
	public static void main (String args[])
	{
	int esum = 0, osum=0, n=3;
		for (int i =1;i<=n;i++)
		{
			if (i/2==0)
			esum = esum + i ;
			else
			osum = osum + i ;
		}
		System.out.println("Sum of Even Number: "+esum);
		System.out.println("Sum of Odd Number: "+osum);
	}
}