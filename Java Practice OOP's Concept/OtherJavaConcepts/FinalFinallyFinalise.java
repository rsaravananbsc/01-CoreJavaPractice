package OtherJavaConcepts;

public class FinalFinallyFinalise {

	public static void main(String[] args) {
		
	    final int x=100;  
//	    x=200;//Compile Time Error  
	      
		//Final is a keyword
		//Final is used to apply restrictions on class, method and variable. 
		//Final class can't be inherited 
		//Final method can't be overridden 
		//Final variable value can't be changed.
		
	    try {
//			int x = 300; //We cant Modify value of Final Variable
		} catch (Exception e) {
			System.out.println(e);
		}
	    
	    finally {
	    	System.out.println("finally block is executed");
		}
	    //Finally is a Block
	    //Finally is used to place important code, it will be executed whether exception is handled or not.
		
	    
	    FinalFinallyFinalise f = new FinalFinallyFinalise();
	    try {
			f.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.gc();
	    
	    //Finalize is used to perform clean up processing just before object is garbage collected.
		
	}

}
