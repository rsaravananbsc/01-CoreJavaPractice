
package first;
import java.util.Scanner;

public class MainShape {

	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		Shape s = null;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Input:");
		
		int a=sc.nextInt();
		
			if(a==1)
			{
				s=new Circle(6.7);
				System.out.println("Area of Circle:"+s.GetArea());
			}
			else
			{
				s=new Square(9.8);
				System.out.println("Area of Square:"+s.GetArea());
			}	
	}
}

class Shape 
{
	double GetArea()
	{
		return(0.0);
	}
}

class Square extends Shape
{
	double side;
	Square (double side)
	{
		this.side=side;
	}
	double GetArea()
	{
		return(side*side);
	}
}

class Circle extends Shape
{
	double r;
	Circle (double r)
	{
		this.r=r;
	}
	double GetArea()
	{
		return(3.143*r*r);
	}
}
