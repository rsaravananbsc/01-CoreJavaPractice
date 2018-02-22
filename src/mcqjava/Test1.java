package mcqjava;

public class Test1 {

	public static void main(String[] args)
	{
		int var1 = 5;
		int var2 = 6;
		if ((var2 = 1) == var1) // Var2 == var1 i.e: 1 == 6 Ans is False Hence else Part Will execute. 
			//Here 1 is assigning to Var2. Now var2 value is 1
		System.out.println(var2);
		else 
		System.out.println(++var2); // Here Var2 Value is increasing by 1. Var2 value is 1 now ++1 so Var2 value is 2 Now.

	}

}
