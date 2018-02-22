package mcqjava;

public class Test5 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		int a =5;
		int b =10;
		first:
		{
			second:
			{
				third:
				{
					if(a==b>>1) // LeftShift Operator B >> 1 means for Ex. B is 10. from Binary value of 10 will be add Zero on Left Side then calc value.
					break second;
				}
				System.out.println(a);
			}
			System.out.println(b);
		}
	}
}
