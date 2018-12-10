package StringFunctions;

public class ReplaceChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "saravanan";
		
		//Method1
		StringBuffer strbuff = new StringBuffer(str);
		strbuff.setCharAt(0, 'S'); //Index starts with 0
		strbuff.setCharAt(strbuff.length()-1, 'N'); //Last Char
		System.out.println(strbuff);
		
		//Method2 
		char[] strarr = str.toCharArray();
		strarr[4] = 'V';
		str = String.valueOf(strarr);
		System.out.println(str);
	}

}
