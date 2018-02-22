package programmingclass;
public class Disarium {
	// Find Disarium Num
	public static void main(String[] args) {
		int n=135;
		if(isDisarium(n))
		{
			System.out.println(n+"is Disarium Number");
		}
		else
		{
			System.out.println(n+"is not a Disarium Number");
		}
	}

	private static boolean isDisarium(int n) {
		int c=getCount(n);
		int sum=0,t=n;
		while(n!=0)
		{
			int r=n%10;
			sum=sum+pow(r,c);
			n=n/10;
			c--;
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
			n=n/10;
		}while(n!=0);
		return c;
	}
}