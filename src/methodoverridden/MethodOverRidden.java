package methodoverridden;
import java.util.Scanner;

public class MethodOverRidden
{

	public static void main(String[] args) 
	{
		
//		Shape cir = new Circle(10.0);
//		System.out.println(cir.getarea());
//		
//		Shape squ = new Square(20.9);
//		System.out.println(squ.getarea());*/
		
		Shape getar = null;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Choose 1.Circle Area 2.Square Area:");
		int ch = sc.nextInt();
		
		if (ch==1)
		{
			getar = new Circle(10); System.out.println("Circle Area: "+getar.getarea());
		}
		else
		{
			getar = new Square(10); System.out.println("Square Area: "+getar.getarea());
		}
	}

}

class Shape
{
	double getarea()
	{
		return 0.0;
	}
}

class Circle extends Shape
{
	double r;
	
	Circle (double r)
	{
		this.r = r;
	}
	
	double getarea()
	{
		return 3.14*r*r;
	}
}

class Square extends Shape
{
	double sq;;
	Square( double sq)
	{
		this.sq = sq;
	}
	
	double getarea()
	{
		return sq*sq;
	}
}
