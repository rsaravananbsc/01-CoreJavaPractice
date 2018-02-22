package otherConcept;

public class GenericsConcept 
{
	public static void main(String[] args) 
	{
		Square<Integer> sq1 = new Square<Integer>(10);
		
		Square<Double> sq2 = new Square<Double>(23.55);
		
		System.out.println(sq1.getArea());
		System.out.println(sq2.getArea());
	}
}


class Square <type>
{
	type s;

	public Square(type s) 
	{
		super();
		this.s = s;
	}
	
	double getArea() 
	{
		if (s instanceof Integer)
		{
			Integer i1 = (Integer)s;
			return i1 * i1;
		}
		if( s instanceof Double)
		{
			Double d1 = (Double)s;
			return d1 * d1;
		}
		return 0.0;
		
	}
}

