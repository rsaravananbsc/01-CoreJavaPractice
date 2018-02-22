package interfaces;

class MyInterface
{
	public static void main(String[] args) 
	{
//		MyClass1 c1 = new MyClass1();
//		c1.m1();
//		c1.m2();
//		System.out.println(MyInter.x);
//		System.out.println(MyInter1.y);
//		
//		c1.m3();
		
		MyInter1 t1 = new MyInter1() 
		{
			
			@Override
			public void m2() 
			{
				System.out.println("I am Overridden Method of Interface1");
				
			}
		};
		t1.m2();
	}
}

class MyClass1 extends MyClass implements MyInter,MyInter1
{
	public void m3()
	{
		System.out.println("I am M3 Method of Class2");
	}
}
	
	

class MyClass
{
	public void m1() 
	{
		System.out.println("I was overridded M1 Method of Interface");	
	}
	
	public void m2()
	{
		System.out.println("I was overridded M2 Method of Interface");
	}
}


interface MyInter
{
	int x=10;
	public void m1();
}

interface MyInter1
{
	int y=20;
	public void m2();
}


