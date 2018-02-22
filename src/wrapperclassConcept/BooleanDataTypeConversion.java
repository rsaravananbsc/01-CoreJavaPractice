package wrapperclassConcept;

public class BooleanDataTypeConversion {

	public static void main(String[] args) 
	{
		String s = "0100"; // Initialized as String Wrapper Type
		Double D = 100.0;
		double d = 200.0;
		
		
		Double b0 = Double.parseDouble("100"); //Passing arguments as Static String value
		System.out.println(s+s); //Before Conversion as a String 01000100
		System.out.println(b0+b0); //After Conversion as Double 200.0
		
		Double b1 = Double.parseDouble(s); //Converting String to Double Value
		System.out.println(b1); // Converted 0100 to Double Answer 100.0
		
		String s3 =Double.toString((double) 100); //Converts the value of primitive data type Double to String
		System.out.println(s3+200); //Converted to String Type Answer is 100.0200
		
		String s4 =Double.toString(D); //Converting Double Wrapper Type to String Type by passing Arguments.
		System.out.println(s4+300); //Converted to String Type Answer is 100.0300
		
		Double d5 = Double.valueOf((Double) 100.0); //Converts the value of primitive Double to Double wrapper object
		System.out.println(d5+100); //Converted to Double Wrapper Class  Answer is 200.0
		
		Double d6 = Double.valueOf(s); // Converts the value of String object to Double wrapper class object
		System.out.println(d6); //Converted to Double Wrapper Class Answer is 100.0
		
		
		
	}
}
