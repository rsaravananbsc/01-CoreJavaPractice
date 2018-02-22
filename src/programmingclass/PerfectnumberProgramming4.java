package programmingclass;
//Write a java program define a method to  check your number is Perfect no or Not?
import java.util.Scanner;
class  PerfectnumberProgramming4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to fine Perfect or Not:");
		int n = sc.nextInt();
		
			if(IsPerfect(n))
			System.out.println("Entered No is Perfect");
			else
			System.out.println("Entered No is Perfect");
	}

	static boolean IsPerfect ( int n)
	{
		int sum =0, i =1;
		while(i<n/2)
		{
			if(n%i==0);
			{
				sum = sum +i;
			}
		}i++;
	return sum==n;
	}
}
