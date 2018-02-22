package methods;
import java.util.Scanner;
class MethodReturn
{
	static void sqroot(int x)
	{
			System.out.println("Square Root Value is: " +x*x);
	}
	
	static void cubic(int x)
	{
			System.out.println("Cubic Value is: " +x*x*x);
	}
	
	static void cubic(String x)
	{
			System.out.println("Your Name Is: " +x);
	}
	
	public static void main(String args[])
	{
		System.out.println("Enter Interger Value to Find SquareRoot & Cubics:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sqroot(n);	
		cubic(n);
	}
}
