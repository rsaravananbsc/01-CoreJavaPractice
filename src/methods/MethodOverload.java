package methods;
class MethodOverload
{
	public static void main(String[] args) 
	{
		disp();
		disp(10);
		disp(10,20);
		disp(10);
		disp();
		disp(10,20);
		disp(10,20);
	}

	static void disp()
		{
			System.out.println("###########");
		}
	  
		static void disp(int a)
		{
			System.out.println("@@@@@@@@");
		}

		static void disp(int a, int b)
		{
			System.out.println("Saravanan");
		}

		static void disp(int a, double b)
		{
			System.out.println("Saravanan");
		}
}
