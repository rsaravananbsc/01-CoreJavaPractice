package wrapperclassConcept;

public class FloatDataTypeConversion {

	public static void main(String[] args) 
	{
		String s = "0100"; // Initialized as String Wrapper Type
		String s1 = "-1a";
		byte b = 50;
		Byte B = 100;
		Float F = 100.0f;
		float f = 200.0f;
		
		
		Float b0 = Float.parseFloat("100"); //Passing arguments as Static String value
		System.out.println(s+s); //Before Conversion as a String 01000100
		System.out.println(b0+b0); //After Conversion as Float 200.0
		
		Float b1 = Float.parseFloat(s); //Converting String to Float Value
		System.out.println(b1); // Converted 0100 to Float Answer 100.0
		
		String s3 =Float.toString((float) 100); //Converts the value of primitive data type Float to String
		System.out.println(s3+200); //Converted to String Type Answer is 100.0200
		
		String s4 =Float.toString(B); //Converting Float Wrapper Type to String Type by passing Arguments.
		System.out.println(s4+300); //Converted to String Type Answer is 100.0300
		
		Float f5 = Float.valueOf((float) 100.0); //Converts the value of primitive float to Float wrapper object
		System.out.println(f5+100); //Converted to Float Wrapper Class  Answer is 200.0
		
		Float f6 = Float.valueOf(s); // Converts the value of String object to Float wrapper class object
		System.out.println(f6); //Converted to Float Wrapper Class Answer is 100.0
		
		
		
	}
}
