package programmingclass;
import java.util.Scanner;
// Find a Prime Number
public class Prims 
	{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no=scan.nextInt();
		if(isPrime(no))
			System.out.println(no +  " is prime");
		else
			System.out.println(no +  " is not a prime");
	}
	public static boolean isPrime(int n) 
	{
		int i=2;
		while(i<=n/2)
		{
			if (n%i==0)
				return false;
			i++;
		}
		return true;
	}
}