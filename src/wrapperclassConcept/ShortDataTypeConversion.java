package wrapperclassConcept;

public class ShortDataTypeConversion {

	public static void main(String[] args) 
	{
		String s = "0100"; // Initialized as String Wrapper Type
		String s1 = "-1a";
		byte b = 50;
		Byte B = 100;
	
		
		Short b0 = Short.parseShort("100"); //Passing arguments as Static String value
		System.out.println(s+s); //Before Conversion as a String 0100100
		System.out.println(b0+b0); //After Conversion as Short 200
		
		Short b1 = Short.parseShort(s, 2); //Converting String to Binary Value
		System.out.println(b1); // Converted 0100 to Binary Answer is 4
		
		Short b2 = Short.parseShort(s, 8); //Converting String to Octal value
		System.out.println(b2); //Converted 0100 to Octal Answer is 64
		
		Short b3 = Short.parseShort(s, 10); //Converting String to Decimal value
		System.out.println(b3); // Converted 0100 to Decimal Answer is 100
		
		Short b4 = Short.parseShort(s1, 16); //Converting String to hexadecimal value
		System.out.println(b4); //Converted -1a to HexaDeciaml Answer is -26
		
		String s3 =Short.toString((short) 100); //Converts the value of primitive data type Short to String
		System.out.println(s3+200); //Converted to String Type Answer is 100200
		
		String s4 =Short.toString(B); //Converting Short Wrapper Type to String Type by passing Arguments.
		System.out.println(s4+300); //Converted to String Type Answer is 100300
		
		Short B1 = Short.valueOf(b); // Converts the value of primitive Short to Short wrapper object
		System.out.println(B1+100); //Converted as Short Wrapper Class Answer is 150
		
		Short B2 = Short.valueOf(s); // Converts the value of String object to Short wrapper class object
		System.out.println(B2+200); //Converted as Short wrapper class Answer is 300
		
		Short B3 = Short.valueOf(s, 2); //Converted String Object to Short Wrapper Class as output mode is in Binary Mode  
		System.out.println(B3); //Converted 0100 to Binary Answer is 4
		
		Short B4 = Short.valueOf(s, 8); //Converted String Object to Short Wrapper Class as output mode is in Octal Mode
		System.out.println(B4); //Converted 0100 to Octal Answer is 64
		
		Short B5 = Short.valueOf(s, 10); //Converted String Object to Short Wrapper Class as output mode is in Decimal Mode
		System.out.println(B5); //Converted 0100 to Decimal Answer is 100
		
		Short B6 = Short.valueOf(s1, 16); //Converted String Object to Short Wrapper Class as output mode is in Binary Mode  
		System.out.println(B6);//Converted 0100 to HexaDecimal Answer is -16
		
	}
}
