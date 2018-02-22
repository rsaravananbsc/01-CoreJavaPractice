package casting;

public class UpDownCasting3 
{
	public static void main(String[] args) 
	{
		Shape sh[] = { new Circle(3.0), new Square(4.0), new Rectangle(5.0, 6.0)};
		
		for(int i=0; i<sh.length;i++)
		{
			if(sh[i] instanceof Circle)
			{
				Circle c = (Circle)sh[i];
				System.out.println(c.getCircleInfo());
			}
			else if (sh[i] instanceof Square)
			{
				Square s = (Square)sh[i];
				System.out.println(s.getSquareInfo());
			}
			else if(sh[i] instanceof Rectangle)
			{
				Rectangle r = (Rectangle)sh[i];
				System.out.println(r.getRectangleInfo());
			}
			else
			{
				System.out.println("None of the Object are Referred");
			}
		}
	
		System.out.println("-------------------------------------------------");
		System.out.println("Biggest Area of Shape");
		System.out.println("-------------------------------------------------");
		
		Shape bs = BigShape.getBigShape(sh);
		
			if(bs instanceof Circle)
			{
				Circle c = (Circle)bs;
				System.out.println(c.getCircleInfo());
			}
			else if (bs instanceof Square)
			{
				Square s = (Square)bs;
				System.out.println(s.getSquareInfo());
			}
			else if(bs instanceof Rectangle)
			{
				Rectangle r = (Rectangle)bs;
				System.out.println(r.getRectangleInfo());
			}
			else
			{
				System.out.println("None of the Object Been Referred");
			}
			
		System.out.println("-------------------------------------------------");

	}
	
}

interface Shape
{
	double getArea();
}

class Circle implements Shape
{
	double r;

	public Circle(double r) 
	{
		super();
		this.r = r;
	}

	public double getArea() 
	{
		return 3.14 * r * r ;		
	}
	
	String getCircleInfo()
	{
		return "Circle Radius" +r +"And Area Is: " +getArea();
	}
}

class Square implements Shape
{
	double side;

	public Square(double side) 
	{
		super();
		this.side = side;
	}

	public double getArea() 
	{
		return side * side; 	
	}
	
	String getSquareInfo()
	{
		return "Square Radius" +side +"And Area Is: " +getArea();
	}
}

class Rectangle implements Shape
{
	double l;
	double b;

	public Rectangle(double l, double b) 
	{
		super();
		this.l = l;
		this.b = b;
	}

	public double getArea() 
	{
		return l * b;		
	}
	
	String getRectangleInfo()
	{
		return "Rectangle Radius " +l +" And " +b +" And Area Is: " +getArea();
	}
}

class BigShape
{
	static Shape getBigShape(Shape sh[]) 
	{
		Shape big = sh[0];
		
		for(int i = 1; i<sh.length; i++)
		{
			if(sh[i].getArea() > big.getArea())
			{
				big = sh[i];
			}
		}
		return big;
	}
	
}

