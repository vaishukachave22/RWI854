package ExceptionHandling.program;

public class Exception03 {
	public static void main(String args[]) {
		System.out.println("1");
		try {
			System.out.println("2");
			int a= 10, b=2,c=0;
			System.out.println("3");
			c = a / c;
			System.out.println("4");
			System.out.println(c);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("5");
			System.out.println("c");
			System.out.println("6");
			// handle exception
		}
		System.out.println("RailWorld");
	}

}
