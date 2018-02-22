//Write a Java Program to define a method get how many Even values present in a array
//Write a Java Program to Return How many Odd values present in a array.
package arrayconcept;

class  ArrayConcept10
{
	public static void main(String[] args) 
	{
		int ar[] = new int[]{1,2,3,4,5,6,7,8,9,10};
		System.out.print("Series of Array values:");
		for (int i=0;i<ar.length;i++)
		{
			System.out.print(" "+ar[i]);
		}
		EvenOdd eo = new EvenOdd();
		eo.even(ar);
		int odd = eo.odd(ar);
		System.out.println();
		System.out.println("Main-Method: Sum of Odd Number:"+odd);
	}	
}

class EvenOdd
{
	void even(int ar[])
	{
		int even =0;
		for (int i=0;i<ar.length;i++)
		{
			if (ar[i]%2==0)
			even = even + 1;
		}
		System.out.println();
		System.out.println("Sub-Method: Sum of Even Number: "+even);
	}

	int odd(int ar[])
	{
		int odd =0;
		for (int i=0;i<ar.length;i++)
		{
			if (ar[i]%2==0)
			odd = odd + 1;
		}
	return odd;
	}


}