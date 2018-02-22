package arrayconcept;
import java.util.Scanner;
class  ArrayConcept7
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		//int n = sc.nextInt();
		int ar[] = new int[sc.nextInt()];
		System.out.println("Size Of Array: " +ar.length);

		SubArray sa = new SubArray();
		sa.getvalue(ar);
		System.out.println();
		sa.returnvalue(ar);
		
	}
}

class SubArray
{	
	void getvalue(int ar[])
	{
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<ar.length ;i++ )
		{
			System.out.println("Enter the " +(i+1) +" Value: ");
			ar[i] = sc.nextInt();
 		}
	}

	int[] returnvalue(int ar[])
	{
		for (int i=0; i<ar.length ;i++ )
		{
			System.out.println("Array Index - " +i  +" ---> " +"Array Value - " +ar[i]);
 		}
	return ar;
	}
	
}
