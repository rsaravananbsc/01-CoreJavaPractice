package inheritance;

class Interitance6 
{
	public static void main(String[] args) 
	{
		Circle c1 = new Circle(3.5);
		c1.getarea();

	}
}

class Shapes
{
	Shapes()
	{
		System.out.println("I am a Shape");
	}
}

class Circle extends Shapes
{
	double r,ans;

	Circle(double r)
	{
		this.r = r;
		System.out.println("Circle:"+ans);
	}
	
	double getarea()
	{
		ans = 3.14*r*r;
		return ans;
	}
}

class Square extends Shapes
{
	double side,ans;

	Square(double side)
	{
		this.side = side;
		System.out.println("Square:"+ans);
	}
	
	double getarea()
	{
		ans=side*side;
		return ans;
	}
}

class Rectangles extends Shapes
{
	double l,b,ans;

	Rectangles(double l, double b)
	{
		this.l = l;
		this.b = b;
		System.out.println("Square:"+ans);
	}
	
	double getarea()
	{
		ans=l*b;
		return ans;
	}
}