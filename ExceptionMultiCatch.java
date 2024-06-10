package ExceptionHandling.program;

public class ExceptionMultiCatch {
	public static void main(String args[]) {
		try {
			int x[] = new int[5];
			x[5] = 40/0;
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		}catch(Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("The program ends here");
	}
}
