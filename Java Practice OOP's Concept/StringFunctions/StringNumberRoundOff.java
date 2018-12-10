package StringFunctions;

public class StringNumberRoundOff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String number = "10.50";
		
		double result = Double.parseDouble(number);		
		String Res = String.valueOf(Math.round(result));
		
		System.out.println(Res);
		
	}

}
