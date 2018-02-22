package packages.ObjectClass;

public class StringBufferBuilderSpeed 
{

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder("JAVA");
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) 
		{
			sb.append("SARAVANAN");
		}
		System.out.println(System.currentTimeMillis()-start); //StringBuilder is Faster because its can support multithread support.
		
		System.out.println("------------------------");
		
		StringBuffer sf = new StringBuffer("JAVA");
		long start1 = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) 
		{
			sb.append("SARAVANAN");
		}
		System.out.println(System.currentTimeMillis()-start1);
		
	}

}
