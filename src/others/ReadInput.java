package others;
//Write a java program to read age of a person and display is eligible to vote system.
import java.util.Scanner; 
class ReadInput
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age:");
		byte age= sc.nextByte();
		
		
		if (age == 0)
		{
			
		}
		if (age>=18)
		{
		System.out.println("Eligible to Vote, Thank You");
		}
		else
		{
		System.out.println("Not Eligible to Vote !!!. Thank You");	
		}
		
		
	}
}