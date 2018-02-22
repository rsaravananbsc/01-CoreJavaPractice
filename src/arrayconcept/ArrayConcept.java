package arrayconcept;

class  ArrayConcept
{
	public static void main(String[] args) 
	{
		
		int[] ar={10,20,30,40,50}; // To initialization of Array & Assign Value to Array.

		System.out.println(ar); // Using Array Name, we can get the address of Array. Ex. I@7852e922
		
		System.out.println("Number of Elements:" +ar.length); // To get the Size of in Array, Need to use Length sub-function on Array. ArrayName.Length(Sub-Function).
		
		System.out.println("Element of Array:"); // To get all value from a Array, we have to use For Loop Statements.
		for (int i=0; i<ar.length ; i++ ) // Array Inilization value always is 0.
		{
			System.out.println("Array Index - " +i  +" ---> " +"Array Value - " +ar[i]);
		}
	}
}
