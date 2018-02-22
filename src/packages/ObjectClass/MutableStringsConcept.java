package packages.ObjectClass;

public class MutableStringsConcept
{
	public static void main(String[] args) 
	{
		Sample10 s1  = new Sample10(10);
//		s1.a = 20; //Cant be assigned because String is Immutable class with Final keyword
//		s1.a = 30; //Cant be assigned because String is Immutable class with Final keyword
		
		System.out.println(s1.a); //Prints 10
		
		Sample10 s2 = new Sample10(40); // Prints 45
		
		System.out.println(s2.a); //prints 45
		
	}
}

class Sample10
{
	final int a;
	public Sample10(int a) 
	{
		super();
		this.a = a;
	}	
}