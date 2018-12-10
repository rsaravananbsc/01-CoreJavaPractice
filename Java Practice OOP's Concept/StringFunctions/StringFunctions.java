package StringFunctions;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Hello";
		String s2 = "How are you";
		String s3 = "Hello";
		
		System.out.println(s1.concat(s2)); //HelloHow are you
		
		System.out.println(s1.trim().concat(s2)); //HelloHow are you
		
		System.out.println(s1.replace('H', 'h')); //hello
		
		System.out.println(s1.equalsIgnoreCase(s2)); //false
		
		System.out.println(s1.equalsIgnoreCase(s3)); //true
		
		
		
		

	}

}
