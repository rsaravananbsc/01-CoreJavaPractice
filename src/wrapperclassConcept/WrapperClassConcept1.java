package wrapperclassConcept;

public class WrapperClassConcept1 {

	public static void main(String[] args) 
	{
		Byte B = 100; //While Initialization its a Wrapper Class
		//When u wanted to Convert from wrapper class to Primitive Type, should have create methods to conversion.
		
		int i = intValue(B); //Converting from Byte Wrapper class to Primitive int Type.
		System.out.println("Primitive int Type:"+(i+1)); //101
		
		double d = doubleValue(B); //Converting From Byte Wrapper class to Primitive double Type.
		System.out.println("Primitive double Type:"+(d+2)); //102
		
		short s = shortValue(B); //Converting From Byte Wrapper class to Primitive short Type
		System.out.println("Primitive short Type:"+(s+3)); 
		
		long l = longValue(B); //Converting From Byte Wrapper class to Primitive long Type
		System.out.println("Primitive long Type:"+(l+4));
		
		float f = floatValue(B); //Converting From Byte Wrapper class to Primitive float Type
		System.out.println("Primitive float Type:"+(f+5));
		
		byte b = byteValue(B); //Converting From Byte Wrapper class to Primitive byte Type
		System.out.println("Primitive byte type:"+(b+6));
		
		char c = charValue(B); //Converting From Byte Wrapper class to Primitive char type
		System.out.println("Primitive char type:"+(c+7));
		
		boolean bo = booleanValue(B); //Converting From Byte Wrapper class to Primitive boolean type
		System.out.println("Primitive boolean type:"+bo);
	}

	private static boolean booleanValue(Byte b) {
		// TODO Auto-generated method stub
		if(b>80)
		return true;
		return false;
	}

	private static char charValue(Byte b) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static byte byteValue(Byte b) {
		// TODO Auto-generated method stub
		return b;
	}

	private static float floatValue(Byte b) {
		// TODO Auto-generated method stub
		return b;
	}

	private static long longValue(Byte b) {
		// TODO Auto-generated method stub
		return b;
	}

	private static short shortValue(Byte b) {
		// TODO Auto-generated method stub
		return b;
	}

	private static double doubleValue(Byte b) {
		// TODO Auto-generated method stub
		return b;
	}

	private static int intValue(Byte b) {
		// TODO Auto-generated method stub
		return b;
	}

	
}
