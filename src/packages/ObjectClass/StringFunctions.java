package packages.ObjectClass;

public class StringFunctions 
{
	public static void main(String[] args) 
	{
		String s  = "Saravanan";
		String s1 = "Bangalore";
		String s2 = "Saravanan";
		
		System.out.println(s.charAt(0)); // Fetch the 0 Index of Character Value
		System.out.println(s.charAt(8)); // Fetch the 8 Index of Character Value 
		System.out.println(s.substring(0, 4)); // Fetch From 0 Index to 4 Character
		System.out.println(s.length()); //Returns length of Stored String value
		System.out.println(s.equals(s2)); //Return True because content is same.
		System.out.println(s.equals(s1)); //Return False because content is same.
		System.out.println(s.codePointAt(0)); //Return ASCII Value of Indexed position
		System.out.println(s.codePointBefore(1)); //Returns ASCII value of One Step before Indexed Position
		System.out.println(s.codePointCount(0, 8)); //Return count of character from 0 to 8 Index Position
	}
}
