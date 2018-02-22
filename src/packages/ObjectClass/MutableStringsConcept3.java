package packages.ObjectClass;

public class MutableStringsConcept3
{
	public static void main(String[] args) 
	{
		//Literal Assign - Here Equals Compare content value, == Compare address
		
		String s1 = "Jsp";
		String s2 = "Jsp";
		String s3 = "Qsp";
		
		System.out.println(s1 == s2); // its prints true because both are in same address because String created by Literals. when both same value
		
		System.out.println(s1 ==s3); // its prints false because both are in same address because String created by Literals. but different value
		
		System.out.println(s1.equals(s2)); //prints True because its compare content.
		System.out.println(s1.equals(s3)); //prints false because both are not same value.
		
		System.out.println("------------------------------");
		
		//Object String Creation - Here == Compares address, Equals Compares Content value
		
		String s4 = new String("Jsp");
		String s5 = new String("Jsp");
		String s6 = new String("Qsp");
		
		System.out.println(s4 == s5); // Returns false because its comparing address not Content value.
		System.out.println(s4 == s6); // Returns false because its comparing address not Content value.
		
		System.out.println(s4.equals(s4)); //Returns True because its Comparing Address as well as Content
		System.out.println(s4.equals(s5)); //Returns True because its Comparing Content Value first, if both are same and Address is different then its returns True
		System.out.println(s4.equals(s6)); //Returns False because Different Address & Value
	}
}

