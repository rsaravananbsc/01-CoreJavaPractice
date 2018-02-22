package programmingclass;
import java.util.Scanner;
// Num Of Prime Number
public class NoOfPrime {
public static void main(String[] args) {
	@SuppressWarnings("unused")
	Scanner scan = new Scanner(System.in);
	int i=0;
	int num=0;
	String primeNumbers="";
	System.out.println("Enter the Value of n:");
	int n=scan.nextInt();
	for(i=1;i<=n;i++)
	{
		int counter=0;
		for(num=i;num>=1;num--)
		{
			if(i%num==0)
			{
				counter = counter +1;
				
			}
		}
		if(counter ==2)
		{
			primeNumbers=primeNumbers+i+"";
		}
	}
	System.out.println("Prime numbers from 1 to n are :");
	System.out.println(primeNumbers);
}
}