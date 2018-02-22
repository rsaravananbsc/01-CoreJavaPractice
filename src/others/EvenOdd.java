package others;
//Write a java program to check your number is Even or Odd Numbers
import java.util.Scanner;
class EvenOdd
{
	public static void main (String args[])
	{
		System.out.println("Enter your number to check EVEN or ODD");
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		
		//if ( a%2 == 0)
		//{
			//System.out.println("Entered No:" +a+ " Even Number");
		//}
		//else
			//System.out.println("Entered No:" +a+ " Odd Number");
			
			
		if ( a/2 * 2 == a)
		{
			System.out.println("Entered No:" +a+ " Even Number");
		}
		else
			System.out.println("Entered No:" +a+ " Odd Number");
	}	
			
			
}