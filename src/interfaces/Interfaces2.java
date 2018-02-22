package interfaces;

public class Interfaces2 
{
	public static void main(String[] args) 
	{
		Shape sh=null;
		
		sh = new Circle(0);
		sh = new Square(0);
		sh = new Triangle(0, 0);
		
		System.out.println(sh.GetArea());
		
	}

}

interface Shape
{
	double GetArea();
}

class Circle implements Shape
{
	double r;
	Circle(double r)
	{
		this.r = r;
	}

	public double GetArea() 
	{
		return 3.14 * r * r;
	}
	
}

class Square implements Shape
{
	double side;
	Square(double side)
	{
		this.side = side;
	}
	
	public double GetArea() 
	{
		return side * side;
	}
}

class Triangle implements Shape
{
	double l;
	double b;
	Triangle(double l, double b) 
	{
		this.l = l;
		this.b = b;
	}

	
	public double GetArea() 
	{
		return l * b;
	}
	
}