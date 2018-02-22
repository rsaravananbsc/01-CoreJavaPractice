package arrayconcept;

class  ArrayConcept1
{
	public static void main(String[] args) 
	{
		int ar[]; // To initialization of Array
		ar = new int[]{10,20,30,40,0}; // Assigning Value to Array

		for (int i=0;i<ar.length ;i++ )
		{
			System.out.print(ar[i]+" ");
		}
		
		System.out.println("1st Position value of array " +ar[0]);
		System.out.println("2nd Position value of array " +ar[1]);
		System.out.println("3rd Position value of array " +ar[2]);
		System.out.println("4nd Position value of array " +ar[3]);
		System.out.println("5nd Position value of array " +ar[4]);
	}
}