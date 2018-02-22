package inheritance;

class  Interitance5 //Hierarchical Inheritance
{
	public static void main(String[] args) 
	{
		
		B1 b = new B1();
		b.Bmethod();
//		b.Amethod(); // Object Created for B Class Only, So B Class Properties can accessible Not A Class Members.
	
		System.out.println();
		C1 c = new C1();
		c.Cmethod();
//		c.Bmethod(); // Object Created for C Class Only, So C Class Properties can accessible Not B Class Members.
//		c.Amethod(); // Object Created for C Class Only, So C Class Properties can accessible Not A Class Members.
		
		
	
		System.out.println();
		D1 d = new D1();
		d.Dmethod();
//		d.Bmethod(); // Object Created for D Class Only, So D Class Properties can accessible Not B Class Members.
//		d.Amethod(); // Object Created for D Class Only, So D Class Properties can accessible Not A Class Members.
		
	}
}

class A1 //Super Class
{
	A1()
	{
		System.out.println("I am A Class");
	}
	public void Amethod()
	{
		System.out.println("Method of Class A");
	}
}

class B1 //Sub Class of A
{
	B1()
	{
		System.out.println("I am B Class");
	}
	public void Bmethod()
	{
		System.out.println("Method of Class B");
	}
}

class C1 //Sub Class of A
{
	C1()
	{
		System.out.println("I am C Class");
	}
	public void Cmethod()
	{
		System.out.println("Method of Class C");
	}
}

class D1 //Sub Class of A
{
	D1()
	{
		System.out.println("I am D Class");
	}
	public void Dmethod()
	{
		System.out.println("Method of Class D");
	}
}