// Write a Java Program to define read the array elements, Display array elements, Calculate the Average of Array Elements 
package arrayconcept;
import java.util.Scanner;
class  ArrayConcept6
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the No of Value of a Array:");
		int n = sc.nextInt();
		
		int ar[] = new int[n];

//		Getting input from user for store in array
		for (int i=0; i<ar.length ;i++ )
		{
			System.out.println("Enter the " +(i+1) +" Value: ");
			ar[i] = sc.nextInt();
 		}

//		 Displaying Array value
		System.out.println("Elements of Array");
		for (int i=0; i<ar.length ;i++ )
		{		
			System.out.println("Array Index - " +i  +" ---> " +"Array Value - " +ar[i]);
		}

//		 Calculating the Sum & Average value of a Array
		int sum = 0; double avg=0;
		for (int i=0; i<ar.length ;i++ )
		{		
			sum = sum + ar[i];
			avg = sum / ar.length;
		}
		System.out.println("Sum of the Array: " +sum);
		System.out.println("Avgerage of the Array: " +avg);
	}
}