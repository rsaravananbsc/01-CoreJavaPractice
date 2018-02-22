package interfaces;

public class Interfaces1 implements Inter1
{

	public static void main(String[] args) 
	{
//		MyCls c1 = new MyCls();
//		c1.m1();
//		c1.m2();
//		
//		System.out.println(Inter1.x);
//		System.out.println(Inter2.y);
	}
	Inter1 i1 = new Inter1() 
	{;
	public void m1()
	{
		System.out.println("HI");
	}
	};
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
}

interface Inter1 
{
	int x =10;
	public void m1();
}

interface Inter2
{
	int y = 20;
	public void m2();
}

class MyCls implements Inter1,Inter2
{
	public void m1()
	{
		System.out.println("I am M1 of Class which is Overridden by Interface1");
	}
	
	public void m2()
	{
		System.out.println("I am M2 of Class which is overidden by Interface2");
	}

}

