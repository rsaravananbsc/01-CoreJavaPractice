package OOPs;

public class MethodOverLoad {
	
	public static void main(String[] args) {
		
		calculation ca = new calculation();
		ca.calc(10, 10);
		ca.calc(10.0, 21.0);
		ca.calc(20.0, 20.0);		
	}
	
	public static class calculation
	{
		public void calc(int x, int y)
		{
			int z =  x + y;
			System.out.println("Addition:"+z);
		}
	
		public void calc(float x, float y)
		{
			float z =  x * y;
			System.out.println("Multiply"+z);			
		}
	
		public void calc(double x, double y)
		{
			double z =  x / y;
			System.out.println("Division"+z);			
		}
	}
}


//1. MethodOverload is having Same Function Name with Different Signature.
//2. Method Overloading is a feature that allows a class to have more than one method having the same name, 
   //if their argument lists are different.
//3. Method overriding is used for compile time polymorphism