package ExceptionHandling.program;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionMultiCatch1 {
	public static void main(String args[]) {
		try(Scanner fileContents = new Scanner(new File(resultFile))){
			return Integer.parseInt(contents.nextLine());
		}catch(FileNotFoundException e) {
			//If an exception occurs while opening the file 
			logger.error("Result file does not exist");
			return 0;
			
		}catch(NumberFormatException e) {
			//if an exception occurs during parsing the contents to integer format
			logger.error("Couldn't format number", e);
			return 0;
			
		}
	}

}
