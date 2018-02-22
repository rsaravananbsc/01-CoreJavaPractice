package blockfinalConcept;

import java.util.Scanner;

public class FinalConcept 
{
	final static int a=100;
	final static int b;
	final static int c;
	
	static
	{
//		a=100;
		b=200;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the C Value:");
		c=sc.nextInt();
	}
	
	public static void main(String[] args) 
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
