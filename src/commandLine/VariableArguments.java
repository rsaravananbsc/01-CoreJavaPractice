package commandLine;

public class VariableArguments {

	public static void main(String[] args) 
	{
		testA();
		testA("A");
		testA("A","B");
		testA("A","B","C");

	}
	//Its support any no of String types.
	public static void testA(String... args)
	{
		for (String string : args) {
			System.out.println(string);
		}
	}
	
	//Its support any no of Object types.
	public static void testA(Object... args)
	{
		for (Object string : args) {
			System.out.println(string);
		}
	}
}
