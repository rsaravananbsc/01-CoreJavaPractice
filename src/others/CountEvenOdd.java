package others;
//Counting the Even and Odd in 1-N Number Series.
import java.util.Scanner;
class CountEvenOdd
{
	public static void main (String args[])
	{
	  System.out.println("Enter the N Value to Find Count of Even & Odd Numbers");
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  
	  int evencnt=0,oddcnt=0;
	  
	  for(int i=1;i<=n;i++)
	  {
	  	if (i%2==0)
		{
			evencnt = evencnt + 1;
		}
		else
		{
			oddcnt = oddcnt + 1;
		}
	  }
	  System.out.println("N Value is: "+n);
	  System.out.println("Even Number Count is: " +evencnt);
	  System.out.println("Odd Number Count is: " +oddcnt);
	}
}