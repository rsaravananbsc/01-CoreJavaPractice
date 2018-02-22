package programmingclass;
import java.util.Scanner;
class  PrimeProgamming3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner( System.in);
		System.out.println("Enter the value to find the series of Prime No's:");
		int n = sc.nextInt();

		int count =0, sum=0;
		for (int i=1; i<=n ;i++ ) //For Loop is to get Count & Sum Funtions
		{
			if(isPrime(i))
			{
				count++; // Count Functions
				sum = sum+i; //Sum Functions
			}
		}
		System.out.println("Count of Prime Number Between 1 to "+n +" :"+count);
		System.out.println("Sum of Prime Number Between 1 to "+n +" :"+sum);
	}
	static boolean isPrime (int m)
		{	
			int j=2;
			while(j<=m/2)
			{
				if(m%j==0)
				return true;
			}
			j++;
			return false ;
		}
}