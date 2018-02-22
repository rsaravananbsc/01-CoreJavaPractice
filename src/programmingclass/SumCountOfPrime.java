package programmingclass;
import java.util.Scanner;
// Sum & Count of Prime Number
public class SumCountOfPrime {
	public static void main(String[] args, int sum) {

		int count=0;sum=0;
		for(int i=1;i<=1000;i++)
		{
			if(isPrime(i))
			{
				count++;
				sum=sum+i;
			}
		}
		System.out.println("Num of prime num between 1 to 1000 is"+count);
		System.out.println("Sum of prime num between 1 to 1000 is"+sum);
	}

	private static boolean isPrime(int i) {
		int j=2;
		while(j<=i/2)
		{
			if(i%j==0)
				return false;
			j++;
		}
		return true;
	}
}