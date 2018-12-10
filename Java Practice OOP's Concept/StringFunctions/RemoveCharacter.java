package StringFunctions;

public class RemoveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeChar("Saravanan",'S'));
		
		String str = "MohanRaj";
		String str1 = str.replace('M', ' ');
		System.out.println(str1);
	}

	private static String removeChar(String str, char c) {
		if (str == null)
	         return null;
	     return str.replaceAll(Character.toString(c), "");
	}
	
	
	
	
}
