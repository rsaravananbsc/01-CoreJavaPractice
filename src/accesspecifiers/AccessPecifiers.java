package accesspecifiers;
class  AccessPecifiers
{
	public static void main(String[] args) 
	{
		System.out.println("Main Class Started");
		Simple s1 = new Simple();
		s1.m2();
	}
}

class Sample
{
	private int w=10; // Private members can be access within class only not in other package even though Object/Inheritance Created
	int x=20; //Default member can be access with in package only via Inheritance/Object Reference. 
				   //But can not access in other package even though via Inheritance/Object Reference
	protected int y=30; //Protected member can be access with in package only via Inheritance/Object Reference. 
								// But can access in other package via Inheritance only.
	public int z=40; // Public members can access inside package also as well can access in other package also via ObjectReference/Inheritance.

	void m1()
	{
		System.out.println(w); // If Private Variable can access within the class only
		System.out.println(x); // If Default Variable can access within the class only
		System.out.println(y); // If Protected Variable can access within the class only
		System.out.println(x); // If Public Variable can access within the class only
	}
}

class Simple
{
	void m2()
	{
		Sample s1 = new Sample();
//		System.out.println("Sample Class Members: "+s1.w); // Private Members can not be access in other Class as its declared as Private 
																					  // Even though If Object Reference Create. 
		System.out.println("Sample Class Members: "+s1.x); // Default Members can be access in other Classes as well.
		System.out.println("Sample Class Members: "+s1.y); // Protected Members can be access in other Classes as well.
		System.out.println("Sample Class Members: "+s1.z); // Public Members can be access in other Classes as well.
	}

}

class Demo extends Sample
{
	void m3()
	{
//		System.out.println(w); // Private Members can not be access in other Class as its declared as Private 
										 // Even though If Classes been inherit. 
		System.out.println(x); // Default Members can be access in other Classes as well. 
		System.out.println(y); // Protected Members can be access in other Classes as well.
		System.out.println(z); // Public Members can be access in other Classes as well.
	}
	}
