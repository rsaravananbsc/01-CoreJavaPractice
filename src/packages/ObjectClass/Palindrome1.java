package packages.ObjectClass;

import java.util.Scanner;

public class Palindrome1 {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String To Check Palindrome:");
		String str = sc.next();

		boolean res = isPalindrome(str);
		
		if(res)
			System.out.println(str+" is Palindrome");
		else
			System.out.println(str+" is not Palindrome");

	}

	private static boolean isPalindrome(String str) 
	{
		char ch[] = str.toCharArray();
		for (int i = 0; i < str.length()/2; i++) 
		{
		if (ch[i] != ch[ch.length-1-i]) 
		{
			return false;
		}	
		}
		return true;
	}

}
