package methods;
import java.util.Scanner;
class MethodSum
{
	static void sum()
	{
		System.out.println("Enter the 2 Number to do find SUM");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b =sc.nextInt();
		
		int sum  = a + b;
		
		System.out.println("SUM of 2 value is: " +sum);		
	}
	public static void main(String args[])
	{
		sum();
		sum();
	}
}
