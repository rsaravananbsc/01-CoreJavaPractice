package others;
//Write a Java program to read 3 Integer Numbers from user and display biggest among those 3 Numbers

import java.util.Scanner;
class BigNum
{
	public static void main(String args[])
	{
		System.out.println("Enter any 3 Number to find which is biggest");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>=b && a>=c)
		{
			System.out.println("Biggest value is: "+a);
		}
	}
}
