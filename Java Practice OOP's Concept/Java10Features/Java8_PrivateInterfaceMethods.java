package Java10Features;

public class Java8_PrivateInterfaceMethods implements PrivateInterface {

	public static void main(String[] args) {
		PrivateInterface.test3(); //Static Methods we can't call directly without Creating Objects
		
		PrivateInterface pt = new Java8_PrivateInterfaceMethods();
		pt.test1(); //Test1 Method is Default hence have to create Objects to access default methods from other Class,Interfaces
		
	}

}

interface PrivateInterface
{
	public default void test1()
	{
		System.out.println("Test1");
	}
	
	private static void test2() // in Java8 Interface we can't create Private Methods. 
	{							 // only Default,Public Methods allowed.
		
	}
	
	public static void test3()
	{
		System.out.println("Test3");
	}
}
