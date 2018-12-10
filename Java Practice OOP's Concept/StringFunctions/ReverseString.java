package StringFunctions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Saravanan";
		String revstr ="";
		
		//Method 1 - StringBuilders Function
		StringBuilder strbld = new StringBuilder();
		strbld.append(str);
		strbld.reverse();
		System.out.println(strbld);
		
		//Method 2 - Collections Reverse
		char[] arr = str.toCharArray();
		
		ArrayList<Character> rev = new ArrayList<Character>();
		
		for (char c : arr) {
			rev.add(c);
		}
		
		Collections.reverse(rev);
		
		Iterator<Character> li = rev.iterator();
		while(li.hasNext())
		{
			System.out.print(li.next());
		}
		System.out.println();
		
		
		//Method 3 - Manual Reverse
		for (int i = str.length()-1; i >= 0; --i) {
			revstr = revstr+str.charAt(i);
		}
		
		System.out.println(revstr);
		
		//Method 4 - StringBuffer Function
		StringBuffer strbuff = new StringBuffer();
		strbuff.append(str);
		strbuff.reverse();
		System.out.println(strbuff);
		
		
	}

}
