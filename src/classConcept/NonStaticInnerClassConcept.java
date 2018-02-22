package classConcept;

public class NonStaticInnerClassConcept 
{
	public static void main(String[] args) 
	{
		Test t1 = new Test();
		Test.Demo td = t1.new Demo();
		
		Test.Demo td1 = new Test().new Demo();
		
		System.out.println(td.a);
		td.m1();
	}
}

class Test // Outer Class
{
	int x = 150;
	int y = 200;
	
	void disp1()
	{
		Demo d1 = new Demo(); // Here object created to access Inner Class Non-Static Members.
		System.out.println(d1.a); //Here can access Inner class  Non-Static Members in Outer class
	}
	
	class Demo //Inner Class
	{
		int a = 90; //Static int b = 45; //Non-Static Member can have only Non-Static members only. 
	
		void m1()
		{
			System.out.println(a); //To access Inner class Non-Static Members can access Directly in Class 
			System.out.println(y); //To access Outer Class Non-Static Members can access Directly in Inner class
		}
	}
}
