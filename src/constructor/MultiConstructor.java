package constructor;

class MultiConstructor 
{
	public static void main(String[] args) 
	{
		MorePara mp1 = new MorePara(10, 20.00);
	}
}


class MorePara
{
	MorePara(int a, double d)
	{
		System.out.println("This is Multi Args Constructor");
		System.out.println("Input values is " +a +" and " +d);
	}	
}