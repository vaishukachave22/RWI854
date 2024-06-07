package RWI.Program;

public class StringReverse {
	//function to reverse a string using StringBuilder
	public static String revstr(String str){
		return new StringBuilder(str).reverse().toString();
	}
	public static void main(String args[]) {
		String str="Java programming";
		str=revstr(str);
		System.out.println("result after reversing a string is: "+str);
	}

}
