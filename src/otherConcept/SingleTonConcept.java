package otherConcept;

public class SingleTonConcept 
{
	public static void main(String[] args) 
	{
		System.out.println(Test.getTest());
		System.out.println(Test.getTest());
		System.out.println(Test.getTest());
	}

}

//Method1 - This Method Create multiple Objects.
//class Test
//{
//	private final static Test t = new Test();
//	
//	private Test()
//	{
//	
//	}
//	
//	static Test getTest()
//	{
//		return new Test();
//	}
//}

//Methods2 - Allows create Object only One Time.

class Test
{
	private final static Test t;
	static
	{
		t = new Test();
	}
	private Test()
	{
	
	}
	
	static Test getTest()
	{
		return t;
	}
}


