package StringFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "malayalam";
		String revstr = " ";
		
		//Method 1 - StringBuilder Functions
		StringBuilder strbuild = new StringBuilder();
		strbuild.append(str1);
		strbuild.reverse();
		
		String str2 = strbuild.toString();
		
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Method1:This is Palindrome");
		}
		else
		{
			System.out.println("Method1:Not Palindrome");
		}
		
		
		//Method 2 - Manual Reverse
		for (int i = str1.length()-1; i >= 0; i--) {
			revstr = revstr + str1.charAt(i);
		}
		
		str2 = revstr;
		
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Method2:Given String is Palindrome");
		}
		else
		{
		System.out.println("Method2:Not Palindrome");
		}
		
		//Method 3 - Collections 
		char[] arr = str1.toCharArray();
		
		ArrayList<Character> ArrRevStr = new ArrayList<Character>();
		
		for (char c : arr) {
			ArrRevStr.add(c);
		}
		
		Collections.reverse(ArrRevStr);
		
		StringBuilder strbld = new StringBuilder();
		for (int i = 0; i < ArrRevStr.size(); i++) {
			strbld.append(ArrRevStr.get(i));
		}
		str2 = strbld.toString();
				
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Method3:Given String is Palindrome");
		}
		else
		{
		System.out.println("Method3:Not Palindrome");
		}
		
		//Method 4 - StringBuffer Functions
		StringBuffer strbuff = new StringBuffer();
		strbuff.append(str1);
		strbuff.reverse();
		System.out.println(strbuff);
		
		str2 = strbuff.toString();
		
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Method4:Given String is Palindrome");
		}
		else
		{
		System.out.println("Method4:Not Palindrome");
		}
		
		
	}	

}
