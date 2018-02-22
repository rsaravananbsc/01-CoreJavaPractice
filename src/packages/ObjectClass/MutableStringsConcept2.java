package packages.ObjectClass;

public class MutableStringsConcept2
{
	public static void main(String[] args) 
	{
		String s1 = "Jspiders";
		String s2 = "Qspiders";
		String s3 = s1.toLowerCase();
		
		System.out.println("--------------------------------------");
		
		System.out.println(s1); //Prints as its as declared - Jspiders
		System.out.println(s3); //Prints as a lower case - jspiders
		
		System.out.println("--------------------------------------");
		
		String s4 = s1.concat(s2);
		System.out.println(s1); //Prints as its as declared - Jspiders
		System.out.println(s4); //Print as combined - JspidersQspiders
		
		System.out.println("--------------------------------------");
		
		String s5 = s1.substring(4);
		System.out.println(s1); //Prints as its as declared - Jspiders
		System.out.println(s5); //Cuts the string from Index 4 onwards till end. - ders
		
		System.out.println("--------------------------------------");
		
		s1 = "Saravanan";
		System.out.println(s1);
	}
}

