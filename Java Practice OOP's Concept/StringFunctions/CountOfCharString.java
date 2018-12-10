package StringFunctions;

import java.util.HashMap;

public class CountOfCharString {

	public static void main(String[] args) {
				
		String inputString = "saravanan";
		
		//Creating a HashMap containing char as a key and occurrences as  a value
		 
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        
		//Converting given string to char array
        char[] strArray = inputString.toCharArray();
        
        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                //If char is present in charCountMap, incrementing it's count by 1
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value
                charCountMap.put(c, 1);
            }
        }
        
        //Printing the charCountMap
        System.out.println(charCountMap);
	}
}
