package blockfinalConcept;

public class InstanceFinalVariable 
{
	final int a = 100;
	final int b;
	final int c;
	
	{
		b=200;
	}
	
	InstanceFinalVariable() 
	{
		c=300;
	}

	public static void main(String[] args) 
	{
		
		//If any object declared by Final Keyword. initialize only one time. cant be reference also
		
		final InstanceFinalVariable IFV = new InstanceFinalVariable(); 
//									IFV1 = new InstanceFinalVariable(); // we already make its as FINAL hence can reference one more time
		
		System.out.println(IFV.a);
		System.out.println(IFV.b);
		System.out.println(IFV.c);

	}

}
