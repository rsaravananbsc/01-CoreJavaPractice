package methods;
class  MethodExample
{
	public static void main(String[] args) 
	{
		System.out.println("Main Class Started");
		m1();
	}

//		void m1() // Inside a Main Class Cant be decalre non-static Methods.
//		{
//			System.out.println("Sub-Method Class Started"); 
//		}

		static void m1()
		{
			System.out.println("Sub-Method Class Started");
		}
}
