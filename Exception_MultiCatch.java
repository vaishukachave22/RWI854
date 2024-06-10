package ExceptionHandling.program;

public class Exception_MultiCatch {
	public static void main(String args[]) {
		try {
			System.out.println(4/0);
		}catch(Exception_throw e) {
			System.out.println("Exception : Divide by 0");	
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic : divide by 0");
		}
	}
}
