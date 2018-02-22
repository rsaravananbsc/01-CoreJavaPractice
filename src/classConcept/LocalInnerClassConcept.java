package classConcept;

public class LocalInnerClassConcept 
{
	static int b = 50; 
	public static void main(String[] args) 
	{
		class Example
		{
			int a = 90;
//			static int b = 100; //Local Inner Class can have only Non-Static Members.
			
			void m1()
			{
				System.out.println("I am M1 Method");
				System.out.println(b);
			}
		}
		
		Example e1 = new Example(); //Here Object created to access Local Inner Class.
		e1.m1(); // //Local Inner class Object access only via Object Creation to that Class.
		System.out.println(e1.a); //Object Created and access the Non-Static Members via Object.
	}
}
