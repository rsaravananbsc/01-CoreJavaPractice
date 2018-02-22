package cloneableMethodConcept;

public class CloneMethods3 //SwallowClone 
{	
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Test10 t1 = new Test10();
		
		t1.x = 300;
		t1.y = 500;
		
		t1.t.a = 450;
		
		System.out.println(t1.x);
		System.out.println(t1.y);
		
		System.out.println(t1.t.a);
		
		Test10 t2 = (Test10)t1.clone();
		t2.x = 420;
		t2.t.a = 1050;
		
		System.out.println(t1.x);
		System.out.println(t2.x);
		
		System.out.println(t1.t.a);
		
	}
}

class Test10 implements Cloneable
{
	int x;
	int y;
	
	Test20 t = new Test20();
	
	protected Object clone() throws CloneNotSupportedException 
	{
		Test10 t1 = (Test10)super.clone(); //SwallowClone
		return t1;
	}
}

class Test20
{
	int a,b;
}
