package cloneableMethodConcept;

public class CloneMethods 
{
	void m1()
	{
		try 
		{
			Object obj = clone();
		} catch (CloneNotSupportedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		CloneMethods CM = new CloneMethods();
		CM.m1();
	}

}
