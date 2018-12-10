package Java10Features;

import java.io.FileOutputStream;

public class Java8_TryWithResource {

	public static void main(String[] args) {
		
		// Resource Should be Declare inside Try()
		 try(FileOutputStream fileStream=new FileOutputStream("javatpoint.txt");){  
             String greeting = "Welcome to javaTpoint.";      
                byte b[] = greeting.getBytes();       
                fileStream.write(b);      
                System.out.println("File written");           
        }catch(Exception e) {  
            System.out.println(e);  
        }   
		
		//This Kind of Declaration is not Support in Java 7 and Java 8
		FileOutputStream fileStream1=new FileOutputStream("javatpoint.txt");  
	        try(fileStream1){  
	             String greeting = "Welcome to javaTpoint.";      
	                byte b[] = greeting.getBytes();       
	                fileStream1.write(b);      
	                System.out.println("File written");           
	        }catch(Exception e) {  
	            System.out.println(e);  
	        }          
	}

}
