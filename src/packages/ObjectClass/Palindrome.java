package packages.ObjectClass;
import java.util.*;

public class Palindrome 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String To Check Palindrome:");
		String str = sc.next();

		String res = isPalindrome(str);
		
		if(res == "true")
			System.out.println(str+" is Palindrome");
		else
			System.out.println(str+" is not Palindrome");
	}

	static String isPalindrome(String str) 
	{
		String res = null;
		for (int i = 0; i < str.length()/2; i++) 
		{
			
			if(str.charAt(i) != str.charAt(str.length()-1-i))
				res  = "false";
			else
				res = "true";
		}
		return res;		
	}
}


