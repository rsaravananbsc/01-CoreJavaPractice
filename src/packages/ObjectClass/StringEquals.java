package packages.ObjectClass;

public class StringEquals 
{

	public static void main(String[] args) 
	{
		//Inside String class Equals methods override and returns compare the HashCode of Current String Object Class
		// and Passed String object, If both same returns True else its returns False. 
		
		String st1 = new String("JSP"); 
		String st2 = new String("jsp");

		System.out.println(st1.equals(st2)); //Its returns False 
		
		String st3 = new String("JSP"); 
		String st4 = new String("JSP");

		System.out.println(st3.equals(st4)); //Its Returns True.

	}

}
