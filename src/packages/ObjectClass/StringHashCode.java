package packages.ObjectClass;

public class StringHashCode 
{

	public static void main(String[] args) 
	{
		String st1 = new String("JSP"); //ToString Methods been overridden and return the HashCode of Stored Value.
		System.out.println(st1.hashCode()); // Returns 
		
		String st2 = "JSP"; //ToString Methods been overridden and return the HashCode of Stored Value.
		System.out.println(st2.hashCode()); 
		
		String st3 = "jsp"; //ToString Methods been overridden and return the HashCode of Stored Value.
		System.out.println(st3.hashCode()); 
		
		String st4 = new String("B"); //ToString Methods been overridden and return the HashCode of Stored Value.
		System.out.println(st4.hashCode()); //Return 66 ACSII Code of B
	}

}
