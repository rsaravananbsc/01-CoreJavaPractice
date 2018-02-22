package wrapperclassConcept;

public class ByteDataTypeConversion {

	public static void main(String[] args) 
	{
		String s = "0100"; // Initialized as String Wrapper Type
		String s1 = "-1a";
		byte b = 50;
		Byte B = 100;
	
		
		byte b0 = Byte.parseByte("100"); //Passing arguments as Static String value
		System.out.println(s+s); //Before Conversion as a String 0100100
		System.out.println(b0+b0); //After Conversion as Byte 200
		
		byte b1 = Byte.parseByte(s, 2); //Converting String to Binary Value
		System.out.println(b1); // Converted 0100 to Binary Answer is 4
		
		byte b2 = Byte.parseByte(s, 8); //Converting String to Octal value
		System.out.println(b2); //Converted 0100 to Octal Answer is 64
		
		byte b3 = Byte.parseByte(s, 10); //Converting String to Decimal value
		System.out.println(b3); // Converted 0100 to Decimal Answer is 100
		
		byte b4 = Byte.parseByte(s1, 16); //Converting String to hexadecimal value
		System.out.println(b4); //Converted -1a to HexaDeciaml Answer is -26
		
		String s3 =Byte.toString((byte) 100); //Converts the value of primitive data type byte to String
		System.out.println(s3+200); //Converted to String Type Answer is 100200
		
		String s4 =Byte.toString(B); //Converting Byte Wrapper Type to String Type by passing Arguments.
		System.out.println(s4+300); //Converted to String Type Answer is 100300
		
		Byte B1 = Byte.valueOf(b); // Converts the value of primitive byte to Byte wrapper object
		System.out.println(B1+100); //Converted as Byte Wrapper Class Answer is 150
		
		Byte B2 = Byte.valueOf(s); // Converts the value of String object to Byte wrapper class object
		System.out.println(B2+200); //Converted as Byte wrapper class Answer is 300
		
		Byte B3 = Byte.valueOf(s, 2); //Converted String Object to Byte Wrapper Class as output mode is in Binary Mode  
		System.out.println(B3); //Converted 0100 to Binary Answer is 4
		
		Byte B4 = Byte.valueOf(s, 8); //Converted String Object to Byte Wrapper Class as output mode is in Octal Mode
		System.out.println(B4); //Converted 0100 to Octal Answer is 64
		
		Byte B5 = Byte.valueOf(s, 10); //Converted String Object to Byte Wrapper Class as output mode is in Decimal Mode
		System.out.println(B5); //Converted 0100 to Decimal Answer is 100
		
		Byte B6 = Byte.valueOf(s1, 16); //Converted String Object to Byte Wrapper Class as output mode is in Binary Mode  
		System.out.println(B6);//Converted 0100 to HexaDecimal Answer is -16
		
	}
}
