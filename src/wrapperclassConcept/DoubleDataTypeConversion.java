package wrapperclassConcept;

public class DoubleDataTypeConversion {

	public static void main(String[] args) 
	{
		String s = "100"; // Initialized as String Wrapper Type
		Boolean B = true;
		boolean b = false;
		
		boolean b0 = Boolean.parseBoolean(s); //Converts the String object to primitive boolean data type
		System.out.println(b0);
		
		String s0 = Boolean.toString(B); //Converts the value of Boolean wrapper class object to String
		System.out.println(s0);
		
		String s1 = Boolean.toString(false); //Converts the value of primitive data type boolean to String
		System.out.println(s1);
		
		Boolean B0 = Boolean.valueOf(b); //Converts the value of primitive boolean to Boolean wrapper object
		System.out.println(B0);
		
		Boolean B1 = Boolean.valueOf(s); //Converts the value of String object to Boolean wrapper class object
		System.out.println(B1);
		
		
	}
}
