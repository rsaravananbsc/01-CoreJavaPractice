package packages.ObjectClass;

public class ImmutableStringBufferConcept
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb); //Print Nothing 
		System.out.println(sb.length()); // Prints value if sb : now length of sb is zero 
		sb.append("Saravanan"); // Storing value by appending command 
		System.out.println(sb); // Printing sb value: sb value is Saravanan
		System.out.println(sb.length()); // Printing sb length value
		System.out.println(sb.capacity()); //print default capacity is 16
		
		System.out.println("--------------------------------");
		
		StringBuffer sf = new StringBuffer(); //Default size is 16
		StringBuffer sf1 = new StringBuffer("raghu"); //Default size is 21 (16+5)
		StringBuffer sf2 = new StringBuffer(5); //Default size is 5
		
		System.out.println("--------------------------------");
		
		System.out.println(sf.capacity());
		System.out.println(sf1.capacity());
		System.out.println(sf2.capacity());
		
		sf.append("Bangalore");
		System.out.println(sf);
		System.out.println(sf.capacity());
		
		sf.delete(2,4);
		System.out.println(sf);
		sf.insert(2, "ng");
		System.out.println(sf);
		
		System.out.println("--------------------------------");
		
		String s1 = new String("JAVA");
		String s2 = new String("JAVA");
		
		StringBuilder sb1 = new StringBuilder("JAVA");
		StringBuilder sb2 = new StringBuilder("JAVA");
		
		System.out.println(s1.equals(s2)); //Returns true because its comparing only Contents
		System.out.println(s1.equals(sb1)); //Return false because its not comparing contents. its comparing content against address
		System.out.println(sb1.equals(sb2)); //Returns false because its comparing address. both address are different
		System.out.println(sb1.equals(sb1)); //Returns true because its comparing address 
		
	}

}
