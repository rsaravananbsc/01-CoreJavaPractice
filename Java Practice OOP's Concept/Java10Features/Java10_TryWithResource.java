package Java10Features;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Java10_TryWithResource {

	public static void main(String[] args) throws FileNotFoundException {
		
		// This types of Declaration is allowed in Java9 and Java 10
		try(FileOutputStream fileStream=new FileOutputStream("javatpoint.txt");){  
             String greeting = "Welcome to javaTpoint.";      
                byte b[] = greeting.getBytes();       
                fileStream.write(b);      
                System.out.println("File written");           
        }catch(Exception e) {  
            System.out.println(e);  
        }   
		
		// This types of Declaration is allowed in Java9 and Java 10
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
