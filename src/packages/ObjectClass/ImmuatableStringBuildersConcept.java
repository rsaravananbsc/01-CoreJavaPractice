package packages.ObjectClass;

public class ImmuatableStringBuildersConcept 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity()); //Default Capacity is 16
		System.out.println("--------------------------------");
		
		sb = new StringBuilder("Sara");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("--------------------------------");
		
		sb = new StringBuilder();
		sb.append("saravanan");
		
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());;
		System.out.println("--------------------------------");
		
		sb.append("Banglaore");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.replace(9, sb.length(), "Salem");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		sb.setLength(50);
		System.out.println(sb.length());
		
		StringBuffer sb1 = new StringBuffer(50);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		StringBuilder sb3 = new StringBuilder(5);
		System.out.println(sb3);
		System.out.println(sb3.length());
		System.out.println(sb3.capacity());
		sb3.append("JSPIDERS");
		System.out.println("--------------------------------");
		System.out.println(sb3);
		System.out.println(sb3.length());
		System.out.println(sb3.capacity()); //Capacity will be calculate like initial value * 2 + 2
		
		StringBuilder sb4 = new StringBuilder();
		System.out.println(sb4.capacity()); // By default capacity is 16
		
	}
}
