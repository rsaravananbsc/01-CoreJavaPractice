package wrapperclassConcept;

public class WrapperClassConstructorConcept 
{
	public static void main(String[] args) 
	{
		Byte b1 = new Byte((byte)10); //Constructor which takes byte value as argument
		Byte b2 = new Byte("10"); //Constructor which takes string value as argument
//		Byte b3 = new Byte("ABC"); //RunTime Error : NumberFormatException
		
		Short S1 = new Short((short)20); //Constructor which takes short value as argument
		Short S2 = new Short("20"); //Constructor which takes string value as argument
		
		Integer I1 = new Integer(30); //Constructor which takes integer value as argument
		Integer I2 = new Integer("30"); //Constructor which takes string value as argument
		
		Long L1 = new Long((long)40); //Constructor which takes long value as argument
		Long L2 = new Long("40"); //Constructor which takes string value as argument
		
		Float F1 = new Float(12.2f); //Constructor which takes float value as argument
		Float F2 = new Float("15.6"); //Constructor which takes string value as argument
		Float F3 = new Float(15.5d); //Constructor which takes double value as argument
		
		Double D1 = new Double(17.5d); //Constructor which takes double value as argument
		Double D2 = new Double("17.8"); //Constructor which takes string value as argument
		
		Boolean B1 = new Boolean(false); //Constructor which takes boolean value as argument
		Boolean B2 = new Boolean("true"); //Constructor which take string as an argument
		
	}
}
