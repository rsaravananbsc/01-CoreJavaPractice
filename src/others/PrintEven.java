package others;
//Write a Java program print between 0 - N Even number.


class PrintEven
{
	public static void main (String args[])
	{
		int i=1, j=0, n = 10, m =10;
		while (i<=n)
		{
			System.out.println("Printing Even Number: " +i);
			i = i +2;
		}
		
		
		while (j<=m)
		{
			System.out.println("Printing Odd Number:" +i);
			j = j + 2;
		} 
	}
}