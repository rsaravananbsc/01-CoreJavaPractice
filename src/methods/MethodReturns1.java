package methods;
//Simple Interes using Methods
import java.util.Scanner;
class MethodReturns1
{
	public static void main(String args[])
	{
		System.out.println("Enter the Amount:");
		
		Scanner sc = new Scanner(System.in);
		double p = sc.nextDouble();
		
		System.out.println("Enter the Interest Rate:");
		double r = sc.nextDouble();
		
		System.out.println("Enter the Year:");
		double t = sc.nextDouble();
				
		double i = simintcalc(p,r,t);
		
		System.out.println("Simple Interest for " +p+ " with " +r+ " interest for " +t+ " years: " +i);
		
	}
	
	static double simintcalc (double p, double r, double t)
	{	
		double ri = r;
		r = ri/100;	
		
  		double i = p * r * t ;
		return i;
  		
	}
	
}