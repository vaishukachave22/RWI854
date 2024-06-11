package ExceptionHandling.program;
import java.io.*;

public class ExceptionFileNotFound {
	public static void main(String args[]) {
		try {
			demoException();
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(JAXBEException e) {
			System.out.println(e.getMessage());
		}
		
	}
	public static void demoException() throws IOEXception, FileNotFoundException, JAXBException{
		
	}

}
