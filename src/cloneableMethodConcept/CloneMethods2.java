package cloneableMethodConcept;

public class CloneMethods2 //DeepClone
{	
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Test1 t1 = new Test1();
		
		t1.x = 300;
		t1.y = 500;
		
		t1.t.a = 450;
		
		System.out.println(t1.x);
		System.out.println(t1.y);
		
		System.out.println(t1.t.a);
		
		Test1 t2 = (Test1)t1.clone();
		t2.x = 420;
		t2.t.a = 1050;
		
		System.out.println(t1.x);
		System.out.println(t2.x);
		
		System.out.println(t1.t.a);
		
	}
}

class Test1 implements Cloneable
{
	int x;
	int y;
	
	Test2 t = new Test2();
	
	protected Object clone() throws CloneNotSupportedException 
	{
		Test1 t1 = (Test1)super.clone();
		t1.t = new Test2(); //Deep Clone
		return t1;
	}
}

class Test2
{
	int a,b;
}
