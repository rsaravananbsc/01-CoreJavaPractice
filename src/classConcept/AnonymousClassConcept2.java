package classConcept;

public class AnonymousClassConcept2 
{
	public static void main(String[] args) 
	{
		Demo1 d1 = new Demo1();
		
		Comparable com = new Comparable() {

			@Override
			public int compareTo(Object arg0) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		
		d1.disp(com);
		
	}
}

interface xyz
{
	void msg();
}

class Demo1
{
	void disp(Comparable c)
	{
		System.out.println("I am Disp Method of Demo Class");
		c.compareTo(c);
	}
}
