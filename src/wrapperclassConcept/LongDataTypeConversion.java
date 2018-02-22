package wrapperclassConcept;

public class LongDataTypeConversion {

	public static void main(String[] args) 
	{
		String s = "0100"; // Initialized as String Wrapper Type
		String s1 = "-1a";
		byte b = 50;
		Byte B = 100;
	
		
		Long b0 = Long.parseLong("100"); //Passing arguments as Static String value
		System.out.println(s+s); //Before Conversion as a String 0100100
		System.out.println(b0+b0); //After Conversion as Long 200
		
		Long b1 = Long.parseLong(s, 2); //Converting String to Binary Value
		System.out.println(b1); // Converted 0100 to Binary Answer is 4
		
		Long b2 = Long.parseLong(s, 8); //Converting String to Octal value
		System.out.println(b2); //Converted 0100 to Octal Answer is 64
		
		Long b3 = Long.parseLong(s, 10); //Converting String to Decimal value
		System.out.println(b3); // Converted 0100 to Decimal Answer is 100
		
		Long b4 = Long.parseLong(s1, 16); //Converting String to hexadecimal value
		System.out.println(b4); //Converted -1a to HexaDeciaml Answer is -26
		
		String s3 =Long.toString((long) 100); //Converts the value of primitive data type Long to String
		System.out.println(s3+200); //Converted to String Type Answer is 100200
		
		String s4 =Long.toString(B); //Converting Long Wrapper Type to String Type by passing Arguments.
		System.out.println(s4+300); //Converted to String Type Answer is 100300
		
		Long B1 = Long.valueOf(b); // Converts the value of primitive Long to Long wrapper object
		System.out.println(B1+100); //Converted as Long Wrapper Class Answer is 150
		
		Long B2 = Long.valueOf(s); // Converts the value of String object to Long wrapper class object
		System.out.println(B2+200); //Converted as Long wrapper class Answer is 300
		
		Long B3 = Long.valueOf(s, 2); //Converted String Object to Long Wrapper Class as output mode is in Binary Mode  
		System.out.println(B3); //Converted 0100 to Binary Answer is 4
		
		Long B4 = Long.valueOf(s, 8); //Converted String Object to Long Wrapper Class as output mode is in Octal Mode
		System.out.println(B4); //Converted 0100 to Octal Answer is 64
		
		Long B5 = Long.valueOf(s, 10); //Converted String Object to Long Wrapper Class as output mode is in Decimal Mode
		System.out.println(B5); //Converted 0100 to Decimal Answer is 100
		
		Long B6 = Long.valueOf(s1, 16); //Converted String Object to Long Wrapper Class as output mode is in Binary Mode  
		System.out.println(B6);//Converted 0100 to HexaDecimal Answer is -16
		
	}
}
