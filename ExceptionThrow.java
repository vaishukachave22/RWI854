package ExceptionHandling.program;

public class ExceptionThrow {
	public static void main(String args[]) {
		try {
			Scanner sc = new Scanner(new File(resultFile));
			return Integer.parseInt(contents.nextLine());
			
		}catch(FileNotFoundException fileNotFound) {
			//handle exception by throwing a new exception 
			throw new IllegalArgumentException("Result file does not exist");
		}
	}
}
