package cloneableMethodConcept;

public class CloneMethods1 
{	
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Test t1 = new Test();
		t1.x = 100;
		t1.y = 200;
		System.out.println(t1.x);
		System.out.println(t1.y);
		
//		Test t2 = t1;
		Test t2 = (Test)t1.clone();
		
		t2.x = 300;
		
		System.out.println(t1.x);
		System.out.println(t2.x);	
		
	}
}

class Test implements Cloneable
{
	int x;
	int y;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone(); //In order to call clone method from Object have to use Super.clone();
	}
}
