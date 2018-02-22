
package wrapperclassConcept;

import java.util.Scanner;
import static java.lang.Integer.*; 
import static java.lang.String.format; 

public class CharacterWrapperClassConcept 
{
	public static void main(String[] args) 
	{
		boolean b0 = Character.isDigit('4');
		boolean b1 = Character.isDigit(4);
		System.out.println(b0);
		System.out.println(b1);
		
		System.out.println(Character.toUpperCase('a'));
		
//		Scan from user for Char Type.
//		Scanner sc = new Scanner(System.in);  
//		char c = sc.next().toCharArray()[0];
		
		System.out.println(sum(10.0,20.f)); //VarArgs Concept
		
		
//		Find MAX,Min Store Value of DataTypes.
		int num = parseInt("526"); // => Integer.parseInt() 
		Integer num2 = valueOf("123"); // => Integer.valueOf()      
		// => String.format() 
		System.out.println(format("Numbers: %d, %d", num, num2)); 
		// => Integer.MAX_VALUE 
		System.out.println(" Integer MAX value = " + MAX_VALUE); 
	
	}
	
//	VarArgs Concept
	static double sum(double d, float f, int...a)
	{
		double sum = d + f;
		
		for (int i = 0; i < a.length; i++) 
		{
			sum = sum + a[i];
		}
	return sum;
	}	

}