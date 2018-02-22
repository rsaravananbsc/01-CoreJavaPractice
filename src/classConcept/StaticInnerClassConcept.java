package classConcept;

public class StaticInnerClassConcept 
{
	public static void main(String[] args) 
	{
		System.out.println(Sample.y); //Outer Class Static Members can access only via OuterClassName.StaticMemberName
		System.out.println(Sample.Simple.b); //Inner Class Static Members can access only via OuterClass.InnerClass.StaticMember
	
		Sample s = new Sample(); //Here object is created to access Outer Class Non-Static Members
		System.out.println(s.x); //Outer Class Non-Static members can access only via Object Creation to Outer Class
		
		Sample.Simple si = new Sample.Simple(); //Here object is created to access Inner Class Static Members
		System.out.println(si.a); //Inner Class Static Members can access via only Creating Object to Inner Class with Outer Class OuterClass.InnerClass.Members
		
		new Sample.Simple().m1();//Here object is created to access Inner Class Static Members
		Sample.Simple.m2(); //Inner Class Static Members can access via only Creating Object to Inner Class with Outer Class OuterClass.InnerClass.Members
	}
}

class Sample
{
	static class Simple
	{
		int a =45;
		static int b=20;
		void m1()
		{
			System.out.println(y);//Directly Can Access Outer Class Static Members.
			disp2(); //Directly Can Access Outer Class Static Members.
			Sample s = new Sample(); //Here Object Created to access x
			System.out.println(s.x); //Inner Class Static Members can access only via Object creation 
			
		}
			
		static void m2()
		{
			System.out.println(y); //Directly Can Access Outer Class Static Members.
			disp2(); //Directly Can Access Outer Class Static Members.
			Sample s = new Sample();//Here Object Created to access x
			System.out.println(s.x); //Inner Class Static Members can access only via Object creation  
		}
	}
	
	int x =10;
	static int y=50;
	void disp1()
	{
		System.out.println(Simple.b); //Inner Class Non-Static Members can access Directly InnerClass.Membersname
		Simple s1 = new Simple(); //Here Object created to access M1 non-Static method.
		s1.m1(); //Inner Class Non-static Members can access only via Object Creation 
		Simple.m2(); //Inner Class Static Methods can access directly in Outer Class
	}
	static void disp2()
	{
		System.out.println(Simple.b); //Inner Class Non-Static Members can access Directly InnerClass.Membersname
		Simple s2 = new Simple(); //Here Object created to access M1 & M2 non-Static method.
		s2.m1();
		Simple.m2(); //To access Inner class Non-Static Members directly can access in outer class.
		}
}
