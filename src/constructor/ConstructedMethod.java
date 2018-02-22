package constructor;

class ConstructedMethod 
{
	public static void main(String[] args) 
	{
		Simple s1 = new Simple(); // Constructor required to create a object. according to how many created, that times objects constructor will execute. 

		//new Simple().name = "Kumar" //This constructed method is temp, only once can use the data to manipulation. Default Constructor.
		
	
	}
}

class Simple
{
	Simple() // Constructor Method should be same as Class Name "Simple".
	{
	String name ="Sarava";
	System.out.println("Simple Constrcuted Method Executed");
	System.out.println(" " +name);
	}
}