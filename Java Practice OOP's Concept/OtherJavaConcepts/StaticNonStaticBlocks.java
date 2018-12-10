package OtherJavaConcepts;

public class StaticNonStaticBlocks {
	
	static
	{
		System.out.println("This is Static Block");
	}
	
	{
		System.out.println("This is Main Non-Static Block");
	}
	
	public static void main(String[] args) {
		
		new StaticNonStaticBlocks();
		System.out.println("I am Main Method");		
	}
	
	//1.Static Block without create Object for class it will execute.
	//2.NonStatic Block can execute post upon Object Created.
	//3.Execution order is StaticBlock, MainMethod Statements.., Main Methods (if non-static block present))
	//4.Execution order is StaticBlock, Main Methods (if non-static block not present))  
	

}