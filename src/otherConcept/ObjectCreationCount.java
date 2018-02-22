package otherConcept;

public class ObjectCreationCount 
{
	public static void main(String[] args) 
	{
		System.out.println(ObjectCount.getNumberOfObject());
		ObjectCount ob1 = new ObjectCount();
		ObjectCount ob2 = new ObjectCount();
		System.out.println(ObjectCount.getNumberOfObject());
		ObjectCount ob3 = new ObjectCount(10);
		System.out.println(ObjectCount.getNumberOfObject());
		ObjectCount ob4 = new ObjectCount();
		ObjectCount ob5 = new ObjectCount();
		ObjectCount ob6 = new ObjectCount();
		ObjectCount ob7 = new ObjectCount();
		System.out.println(ObjectCount.getNumberOfObject());
		
	}

}

class ObjectCount
{
	private static int count=0;
	
	{
		count++;
	}
	
	ObjectCount()
	{
		
	}
	ObjectCount(int a)
	{
		
	}
	static int getNumberOfObject() {return count;}
}