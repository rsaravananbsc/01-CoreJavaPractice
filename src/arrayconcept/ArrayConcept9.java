//Write a Program to Copy a Array Elements into another Elements
package arrayconcept;
class ArrayConcept9 
{
	public static void main(String[] args) 
	{
			
		int ar[] = new int[]{10,20,30};		
		
		

		CopyArray ca = new CopyArray();
		
		int br[] = ca.copy(ar);
		System.out.println("After value of B Array");
		for (int i =0;i<br.length;i++)
		{
			System.out.println("B Array Index - " +i  +" ---> " +"B Array Value - " +br[i]);
		}	
	}
}

class CopyArray
{
	int[] copy(int ar[])
	{
		int br[] = new int[ar.length];
		for (int i =0;i<ar.length;i++)
		{	
			br[i] = ar[i];
		}
	return br;
	}
}
