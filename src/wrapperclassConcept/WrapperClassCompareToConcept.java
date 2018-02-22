package wrapperclassConcept;

public class WrapperClassCompareToConcept {

	public static void main(String[] args) 
	{
		Byte b1,b2;
		Short s1,s2; 
		Long L1,L2;
		Float F1,F2;
		Double D1,D2;
		Boolean B1,B2;
		
		b1 = new Byte("50"); b2 = new Byte("100");
		
		s1 = new Short("100"); s2 = new Short("200");
		
		L1 = new Long(100); L2 = new Long(200);
		
		F1 = new Float(100); F2 = new Float(200);
		 
		D1 = new Double(100); D2 = new Double(200);
		
		B1 = new Boolean(true); B2 = new Boolean(false);
	
		int res = b1.compareTo(b2);
		System.out.println(res);
		
		int res1 = s1.compareTo(s2);
		System.out.println(res1);
		
		int res2 = L1.compareTo(L2);
		System.out.println(res2);
		
		int res3 = F1.compareTo(F2);
		System.out.println(res3);
		
		int res4 = D1.compareTo(D2);
		System.out.println(res4);
		
		int res5 = B1.compareTo(B2);
		System.out.println(res4);

	}

}
