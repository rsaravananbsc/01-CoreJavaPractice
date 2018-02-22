package methods;
// Define a method to reverse the given number.
class MethodReturn6
{
	public static void main(String args[])
	{
		int a = 3572;
		int rev = reverse(a);
		System.out.println("Reverse of" +a +" is: " +rev);
	}
	
	static int reverse(int n)
	{
		int rev=0;
		
		while (n!=0)
		{
			int r=n/10;
			rev = rev*10 + r;
			n=n/10;	
		}		
	return rev;
	}
}