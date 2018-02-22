package arrayconcept;

class  ArrayConcept2
{
	public static void main(String[] args) 
	{
		
		
		//Static Array No need to Create Object to Access Array values
		System.out.println("A Array Elements:");
		for (int i=0; i<Array.a.length; i++ )
		{	
			System.out.println(i +" " +Array.a[i]);
		}
		
		Array b1 = new Array(); // B is Non-Static Array, Object Needs to Create to Access Array Values
		
		//This is Non-Static Array of B
		System.out.println("B Array Elements:");
		
		for (int i=0; i<b1.b.length ;i++ )
		{
			System.out.println(i +" " +b1.a[i]); 
		}
		
		// C is Non-Static Array, Object Needs to Create Object to Access C Array Values
		b1.m1(); //b1 is Object that Already Created, M1 is Method, So ReferenceName.Object like we can access.
	}
}

class Array
{
	static int[] a={1,1,13,14,15,16};
	int[] b={10,20,30,40,50};

	void m1()
	{
		int[] c={1,2,3,4,5,6};
		System.out.println("C Arrary Elements");

		for(int i=0; i<c.length ; i++)
		{
			System.out.println(i +" " +c[i]);
		}
	}
}
