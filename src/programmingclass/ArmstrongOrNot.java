package programmingclass;
public class ArmstrongOrNot {
	// Armstrong Num Or Not
	public static void main(String[] args) {
		int n=370;
		if(isArmstrong(n))
		{
			System.out.println(n+ " Is a Armstrong Number: ");
		}
		else
		{
			System.out.println(n+ " Is not a Armstrong Number: ");
		}
	}

	private static boolean isArmstrong(int n)
		{
		int c =getCount(n);
		int sum =0,t=n;
		
		while(n!=0)
		{
			int r=n%10;
			sum=sum+pow(r,c);
			n=n/10;
		}
		return t==sum;
	}

	private static int pow(int n, int p) {
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}

		return pw;
	}

	private static int getCount(int n) {
		int c=0;
		do {
			c++;
			n = n/10;
		}while(n!=0);
		return c;
	}
}