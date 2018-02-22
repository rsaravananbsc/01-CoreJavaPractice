package others;
//Write a java program to calculate sum of N Number.

import java.util.Scanner;
class SumofN
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N Value:");
		int n = sc.nextInt();
		
		
		if(n>0)
		{
			int i=1, sum=0;
			while (i<=n)
			{
				sum = sum + i ;
				i++;			
			}	
			System.out.println("Sum Of First " +n +" Natural No is: " +sum);			
		}
		else 
		{
			int i =-1, sum=0;
			while (i>=n)
			{
				sum = sum + i;
				i--;
			}
			System.out.println("Sum Of First " +n +" Natural No is: " +sum);	
		}
			
		
			
	}
}