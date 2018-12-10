package Java10Features;

import java.util.ArrayList;

public class Java8_AnonymousInnerClasses {

	public static void main(String[] args) {
		
		ABCD<String> a = new ABCD<>() { 	
			public String show(String a, String b) {
				return a + b;
			} 
		};
		
		String result = a.show("Java","10");  
	    System.out.println(result); 
	}

}

class ABCD<String>
{
	public String show(String a, String b) {
		return null;
	}	
}

class XYZ
{
	ArrayList<String> AL = new ArrayList<>();
}