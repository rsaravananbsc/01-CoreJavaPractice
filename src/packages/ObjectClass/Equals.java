package packages.ObjectClass;

public class Equals 
{
	public static void main(String[] args) 
	{
		Sample3 s1 = new Sample3();
		Sample3 s2 = new Sample3();
		
		System.out.println(s1.equals(s1));
		System.out.println("----------------");
		System.out.println(s1.equals(s2));
		System.out.println("----------------");
		System.out.println(s2.equals(s2));
		System.out.println("----------------");
		System.out.println(s2.equals(s1));
		
		
		Simple si1 = new Simple(10);
		Simple si2 = new Simple(20);
		Simple si3 = new Simple(10);
		
		Sample3 s3 = s2;
		
		System.out.println("----------------");
		
		System.out.println(si1.equals(si2));
		System.out.println(si1.equals(si3));
		System.out.println(si2.equals(si3));
		System.out.println(si2.equals(s1));
		System.out.println(s1.equals(si2));
		System.out.println(s3.equals(s1));
	}
}

class Sample3
{
	
	
}

class Simple
{
	int a;
	public Simple(int a) 
	{
		super();
		this.a = a;
	}
	
	public boolean equals(Object obj)
	{
		if (obj instanceof Simple)
		{
			Simple si = (Simple)obj;
			return this.a == si.a;
		}
		else
			return false;
	}
	
}

