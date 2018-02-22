// Write define a method to return how many prime number present in a array.
package arrayconcept;
class ArrayConcept11
{
	public static void main(String[] args) 
	{
		int ar[] = new int[]{1,2,3,4,5,6,7,8,9,10};
		System.out.print("Series of Array values:");
		for (int i=0;i<ar.length;i++)
		{
			System.out.print(" "+ar[i]);
		}
		Prime pr = new Prime();
		int prival = pr.returnvalue(ar);
		System.out.println();
		System.out.println("Main-Method: Sum of Prime Number: "+prival);
		
	}
}

class Prime
{
	int returnvalue(int ar[])
	{
		int prime =0;
		for (int i=0;i<ar.length;i++)
		{
			
			if (ar[i]%2==0)
			prime = prime + 1;
		}	
	return prime;
	}
}
