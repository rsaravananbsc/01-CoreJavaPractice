package commandLine;

public class CommandLineArgs {

	public static void main(String[] args) 
	{
		System.out.println("HI");
		System.out.println("Length"+args.length);
		for(String s:args) {
			System.out.println(s);
		}
		System.out.println("Bye");

	}

}
