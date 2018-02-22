package accesspecifiers;
import accesspecifiers.*;

class AccessPecifiers1
{
	public static void main(String[] args) 
	{
	
	}
}

class Test1
{
	int w=10;
	int x=20;
	int y=30;
	int z =40;
	void m4()
	{
		Sample s2 = new Sample();
//		System.out.println(s2.w); // Private Members can not be access in different package Even though Object Reference/Inherit Created.
		System.out.println(s2.x); // Default Members can not be access in different package Even though Object Reference/Inherit Created.
		System.out.println(s2.y); // Protected Members can not be access in different package Even though Object Reference Created.
		System.out.println(s2.x); // Public Members can be access in different package through via importing other package.
	}
}

class Test2 extends Sample
{
	void m5()
	{
//		System.out.println(w); // Private Members can not be access in different package Even though Object Reference/Inherit Created.
		System.out.println(x); // Default Members can not be access in different package Even though Object Reference/Inherit Created.
		System.out.println(y); // Protected Members can be access in different package by using Inherit Created.
		System.out.println(x); // Public Members can be access in different package through via importing other package.
	}
}                   