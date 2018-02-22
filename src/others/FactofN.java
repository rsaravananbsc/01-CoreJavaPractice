package others;
//Write a java program of factorial of N value

import java.util.Scanner;
class FactofN
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N Value:");
		int n = sc.nextInt();
		
		if(n>0)
		{
			int i=1, fact=1;
			while (i<=n)
			{
				fact = fact * i ;
				i++;			
			}	
			System.out.println("Factorial Of First " +n +" Natural No is: " +fact);			
		}
		else 
		{
			int i =-1, fact=1;
			while (i>=n)
			{
				fact = fact * i;
				i--;
			}
			System.out.println("Factorial Of First " +n +" Natural No is: " +fact);	
		}
		
	}
}