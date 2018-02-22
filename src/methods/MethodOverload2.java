package methods;
class  MethodOverload2
{
	public static void main(String[] args) 
	{
		disp (10);
		disp (10.00);
	}

	static void disp(char a)
	{
		System.out.println("I am a Integer type arguments");
		System.out.println(" " +a);
		System.out.println("--------------------------");
	}

	static void disp( double b)
	{
		System.out.println("I am a Dbouble type arguments");
		System.out.println(" " +b);
		System.out.println("--------------------------");
	}

}
