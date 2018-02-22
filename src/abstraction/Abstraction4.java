package abstraction;

import java.util.Scanner;

public class Abstraction4 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 Digits to Find ADD, MUL");
		System.out.print("Enter the First Value:");
		int a = sc.nextInt();
		System.out.print("Enter the Second Value:");
		int b = sc.nextInt();
		Test t1 = new Add();
		System.out.println("Addtion:"+t1.getAddtion(a, b));
		//Test t2 = new Add();
	}
}

abstract class Test
{
	int getAddtion(int a, int b)
	{
		return a+b;
	}
}

class Add extends Test
{
	int getAddtion(int a, int b)
	{
		return a+b;
	}
	
	int getMultiply(int a, int b)
	{
		return a*b;
	}
}
