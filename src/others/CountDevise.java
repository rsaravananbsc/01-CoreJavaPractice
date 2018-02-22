package others;
//Write a java program to count how many numbers are divisible by both 3 and 5 between 1 - 10. 
import java.util.Scanner;
class CountDevise
{
	public static void main (String args[])
	{
		System.out.println("Enter the N value to find devise by 3 & 5:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int i=1;
		
		while (i<=n)
		{
			if(i%3==0 && i%5==0)
			{
			  	count = count +1;
			}
			i++;
		} 
		
		if(count >=0)
		System.out.println("Count of No Which Devise by 3 & 5: "+count);
		else
		System.out.println("There is no counts, Which Devise by 3 & 5: "+count);
		
			
	}
		
}
