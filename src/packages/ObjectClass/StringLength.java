package packages.ObjectClass;

public class StringLength 
{
	public static void main(String[] args) 
	{
	
		String st1 = new String("Saravana");
		String st2 = new String();
		
		
		System.out.println(st1.length()); //Its returns 8 is Length 
				
		System.out.println(st2.isEmpty()); //Its Returns True. because there is no string.
		
		System.out.println(st1.equalsIgnoreCase(st2)); //Its Returns false because both are not same.
		System.out.println(st1.equalsIgnoreCase(st1)); //Its Returns True because both are same.
		
		//Index starts with 0
		System.out.println(st1.charAt(0)); //Returns S Letter 
		System.out.println(st1.charAt(2)); // Returns R letter
//		System.out.println(st1.charAt(-1)); // Error 
		System.out.println(st1.charAt(+2)); // Returns R Letter
		
		
		
	}

}
