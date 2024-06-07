package RWI.Program;

public class StringRemoveChar {
	public static void main(String args[]) {
		String str = "Hello World";
		
		System.out.println("String after removing 'e' = "+str.replace("e",""));
		
		System.out.println("String after removing First 'e' = "+str.replaceFirst("e", ""));
		
		System.out.println("String after replacing all small letters = "+str.replaceAll("([A-Z])", ""));
	}

}
