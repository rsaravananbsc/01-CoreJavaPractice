package OtherJavaConcepts;

import java.util.Arrays;
import java.util.List;

public class ReturnMultipleValuesFromMethods {

	public static void main(String[] args) {
		
		//Method 1 //Using Return a Collection
		List<Object> person = getDetails1();
		System.out.println(person);
		
		//Method 2 //Using Return a Delimiter
		String[] name = getDetails2().split("~");
		for (String string : name) {
			System.out.println(string);
		}
		
		//Method 3 //Using Return a Array
		int[] ints = getDetails3();
		System.out.println(Arrays.toString(ints));
		

	}
	
	public static List<Object> getDetails1()
	{
		String name = "Saravanan";
		int age = 25;
		char gender = 'M';
		long income = 100000;

		return Arrays.asList(name, age, gender, income);
	}
	
	public static String getDetails2() {
		return "Saravanan" +"~" +"Rajamanickam";
	}
	
	private static int[] getDetails3() {
		int v1 = 100;
		int v2 = 200;
		int v3 = 300;
		return new int[] {v1,v2,v3};
	}
	
}
