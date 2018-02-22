package others;
//Write a Java Program to check your entered No is Perfect or Not ?

import java.util.Scanner;
class PerfectNo
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N Value:");
		int n = sc.nextInt();
		
		int d=1, sum =0; 
		
		do 
		{
			if (n/2 == 0)
			{
				sum=sum+d;
			}
			d++;
		} while (d<=n/2);
	}
}