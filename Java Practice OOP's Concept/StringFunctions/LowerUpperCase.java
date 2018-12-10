package StringFunctions;

public class LowerUpperCase {

	public static void main(String[] args) {
		
		String str = "saraVanan";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		
		//Converting Specific Char as UpperCase/LowerCase
		char[] arrchar = str.toCharArray();
		arrchar[0] = Character.toUpperCase(arrchar[0]); //First Char Change
		
		int len = arrchar.length;
		arrchar[len-1] = Character.toUpperCase(arrchar[len-1]); //Last Chat Change
		
		String newstr = new String(arrchar);
		System.out.println(newstr);
		
	}

}
