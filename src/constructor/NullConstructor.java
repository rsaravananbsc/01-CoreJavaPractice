package constructor;

class NullConstructor
{
	public static void main(String[] args) 
	{
		NoConstruct nc1 = new NoConstruct(); // To achieve NoConstruct, Object should been created. 
		System.out.println("This is Null Constructor Method");
	}
}

class NoConstruct
{
	// Here is no Constructor, hence Compiler will generates a Constructor itself. ( when only applicable new object been created.
}
