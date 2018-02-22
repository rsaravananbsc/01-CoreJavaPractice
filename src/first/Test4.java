package first;


class Test4
{
 public static void main(String[] args)
	{
	 Sample s1 = new Sample();
	 s1.m1(); // Simple M1 method overridden by Sample M1 Method. // Here Sample M2 method implementation only display.
	 s1.m2(); // Simple M2 Methods is static even though, can access in another class. 
	 Simple.m2(); // Static Methods are can be invoke like this only.
//	 s1.m3(); // Simple M3 is Private Methods and can not invoke into another class.
	 
	 Simple s2 = new Sample(); //Object Does matter. Here can access Sample & Simple Members also.
	 s2.m1(); // Sample M1 method overridden by Sample M1 Method. // Here Sample M2 method implementation only display. 
	 s2.m2(); // Simple M2 Methods is static even though, can access in another class.  
	 Simple.m2(); // Static Methods are can be invoke like this only.
	 
	 
	}
}

class Simple //Methods Overriding
{
	void m1()
	{
		System.out.println("i am m1 of simple");
	}
	
	static void m2()
	{
		System.out.println("i am m2 of simple");
	}

	@SuppressWarnings("unused")
	private void m3() //Private methods are not possible to invoke in another class
	{
		System.out.println("i am m3 of simple and i am private");
	}
}

class Sample extends Simple
{
	void m1()
	{
		System.out.println("Now m1 overwrite in Sample");
		m3(); // This Sample M3 methods is Private so can call within same Class only.
	}

//	void m2()
//	{
//		Static method we can not over write
//	}

	private void m3()
	{
		System.out.println("i am m3 in sample");
	}
}