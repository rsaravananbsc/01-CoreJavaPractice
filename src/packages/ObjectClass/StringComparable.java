package packages.ObjectClass;

public class StringComparable 
{
	public static void main(String[] args) 
	{
		//Inside String class CompareTo methods overridden and return the positive or Negative value of Current Object & Passed Object.
		String st1 = new String("A");
		String st2 = new String("D");
		
		String st3 ="A";
		String st4 ="";
		
		int c1 = st1.compareTo(st2); 
		int c2 = st2.compareTo(st1); 
		
		System.out.println(c1);//Return Negative Integer value because both Value is different
		System.out.println(c2);//Returns Positive Integer Value because both value is Same
		System.out.println(st1.compareTo(st1));//Return Zero because Content is same.
		
		System.out.println(st3.compareTo(st4));
		
	}

}
