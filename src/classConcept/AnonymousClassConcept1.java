package classConcept;

public class AnonymousClassConcept1
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo();
//		D.disp(null); //If pointed to Null, Its gives NullPointerException Because this is not Pointer to any Object
		
			
		IntFace i1 = new IntFace() {

			public void msg() 
			{
				System.out.println("I am Override Msg of Anonymous Class");
			}
		};
		
		d1.disp(i1);
	}
}

interface IntFace
{
	void msg();
}

class Demo
{
	void disp(IntFace i)
	{
		System.out.println("I am Disp Method of Demo Class");
		i.msg();
	}
}
