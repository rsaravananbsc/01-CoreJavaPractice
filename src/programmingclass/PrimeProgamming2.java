package programmingclass;
// Wirte a java program to check passed number is prime number or Not?

// Prime number is Devised by 1 and Itself ( Ex. 7 is Number, is devised by 1 & 7) 
// Anyone of Deviser is half of the Number) Ex: 30 is input till 15 enough to check.
import java.util.Scanner;
class  PrimeProgamming2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner( System.in);
		System.out.println("Enter the value to fine Prime/Not:");
		int n = sc.nextInt();

		if (isprime(n))
		System.out.println("Entered No is Prime");
		else 
		System.out.println("Entered No is Not Prime");
	}

	static boolean isprime (int n)
		{	
			int i=2;
			while(i<=n/2)
			{
				if(n%i==0)
				return false;
			}
			i++;
			return true;
		}
}
