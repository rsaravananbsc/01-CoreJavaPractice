// Write a Java Program to Combine 2 Array's
package arrayconcept;
class  ArrayConcept8
{
	public static void main(String[] args) 
	{
		int ar[] = new int[]{10,20,30};
		int br[] = new int[]{40,50,60};

		for (int i =0;i<ar.length;i++)
		{
			System.out.print(ar[i] +" ");
		}

		for (int i =0;i<br.length;i++)
		{
			System.out.print(br[i] +" ");
		}
		
		System.out.println();
		int cr[] = new int[ar.length + br.length];
		System.out.println(cr.length);

		for(int i=0;i<ar.length;i++)
		{
			cr[i] = ar[i];
			System.out.print(cr[i]+" ");
		}
		
		for(int i=0;i<br.length;i++)
		{
			cr[i] = br[i];
			System.out.print(cr[i]+" ");
		}
	}
}


//class ArrayConcept8
//{
//	public static void main(String args[])
//	{
//		int ar[] = new int[]{10,20,30};
//		int br[] = new int[]{40,50,60};
//
//		int cr[] = new int[ar.length+br.length];
//			 
//		System.out.println(cr.length);
//		Com cm = new Com();
//		cm.returnvalue(ar, br);
//	}
//}
//
//class Com
//{
//	int[] returnvalue(int ar[], int br[])
//	{
//	
//		int cr[] = new int[ar.length+br.length];
//			 
//		System.out.println(cr.length);
//
//		for(int i=0;i<ar.length;i++)
//		{ 
//			cr[i] = ar[i]; 
//			System.out.print(cr[i]+" "); 
//		}
//				
//		for(int i=0;i<br.length;i++)
//		{ 
//			cr[i] = br[i]; 
//			System.out.print(cr[i]+" "); 
//		}
//	return cr;
//	}
//}