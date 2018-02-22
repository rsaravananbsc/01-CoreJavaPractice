package others;
//Write a Java Program Multipilication Tables Program.
import java.util.Scanner;
class MultiTables
{
	public static void main(String args[])
	{
		System.out.println("Enter the Value of Multipilication Tables:");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the Value of End of Tables:");
		int m=sc.nextInt();
		
		System.out.println("Tables of Multiplication " +n );
		
		for (int i=1;i<=m;i++)
		{
		System.out.println(+n +" X " + i +" = " +n*i );	
		}
		
	}
}