package arrayconcept;
import java.util.Scanner;
class  ArrayConcept5
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of Value of a Array:");
		int n = sc.nextInt();

		int ar[] = new int[n];

//		Will print Default Value of a Array
		for (int i=0; i<ar.length ;i++ )
		{
			System.out.println("Array Index - " +i  +" ---> " +"Array Value - " +ar[i]);
		}

//		Getting input from user for store in array
		for (int i=0; i<ar.length ;i++ )
		{
			System.out.println("Enter the " +(i+1) +" Value: ");
			ar[i] = sc.nextInt();
 		}

//		 Display the Array value
		System.out.println("Elements of Array");
		for (int i=0; i<ar.length ;i++ )
		{
			
			System.out.println("Array Index - " +i  +" ---> " +"Array Value - " +ar[i]);
		}


	}
}