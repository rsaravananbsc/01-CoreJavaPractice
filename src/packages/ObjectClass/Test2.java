package packages.ObjectClass;

public class Test2 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		String s1 = new String ("QSP");
		Object obj = new String("QSP");
		Comparable com = new String("QSP");
		
		System.out.println(obj.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(com.hashCode());
		
		System.out.println(s1.compareTo((String)obj));
//		System.out.println(obj.compareTo(s1));
		System.out.println(com.compareTo(s1));
		
		

	}

}
