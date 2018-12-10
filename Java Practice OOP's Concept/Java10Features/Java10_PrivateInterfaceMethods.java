package Java10Features;

public class Java10_PrivateInterfaceMethods implements PrivateInterface {

	public static void main(String[] args) {
		
		PrivateInterface.test3(); //Static Methods we can't call directly without Creating Objects
		
		PrivateInterface pt = new Java10_PrivateInterfaceMethods(); //Object Created
		
		pt.test1(); //Test1 Method is Default hence have to create Objects to access default methods from other Class,Interfaces
		
	}

}

interface PrivateInterface
{
	public default void test1()
	{
		System.out.println("Test1");
		PrivateInterface.test2();
	}
	
	private static void test2()  
	{							
		System.out.println("Private Test2");
	}
	
	public static void test3()
	{
		System.out.println("Test3");
	}
}
