package others;
class LeastNum
{
	public static void main(String args[])
	{

		int a=5,b=10,c=15,d=20,e=25;
		
        	if (a > b && a > c && a > d && a > e)
        	System.out.println("Highest Number is: " +a);
        	if (b > c && b > d && b > e && b > a)
        	System.out.println("Highest number is: " +b);
		if (c > d && c > e && c > a && c > b)
		System.out.println("Highest number is: " +c);
		if (d > e && d > a && d > b && d > c)
		System.out.println("Highest number is: " +d);
		if (e > a && e > b && e > c && e > d)
		System.out.println("Highest number is: " +e);

		if (a < b && a < c && a < d && a < e)
        	System.out.println("Least Number is: " +a);
        	if (b < c && b < d && b < e && b < a)
        	System.out.println("Least number is: " +b);
		if (c < d && c < e && c < a && c < b)
		System.out.println("Least number is: " +c);
		if (d < e && d < a && d < b && d < c)
		System.out.println("Least number is: " +d);
		if (e < a && e < b && e < c && e < d)
		System.out.println("Least number is: " +e);

	}
}