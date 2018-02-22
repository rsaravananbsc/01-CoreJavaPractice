package wrapperclassConcept;

public class WrapperClassConcept 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		int a=20;
		Integer i = (Integer)a; //Boxing, Internally Int Value to converting to Integer Primitive type then referring Object
		disp(i);
		
		Integer i1 = 34; //Boxing
		disp(i1);
		
		disp(234); //Boxing 
		
		Object obj = 67.89; //Boxing
		Object obj1 = new Double(67.89); //Boxing
		
		int x = get(890); //Boxing and Un-Boxing
		
		double b = (double)obj1; //UnBoxing
		
		Double db = new Double(45.67); //Boxing
		
		double di=db; //Un-Boxing
	}

	static void disp(Object obj)
	{
		System.out.println(obj);
//		System.out.println(obj instanceof Integer);
	}
	
	static Integer get(Integer i)
	{
		return i;
	}
}
