package RWI.Program;

public class StringSubString {
	public static void main(String args[]) {
		String str = "Java Programming Language";
		
		//prints substring from 7th index
		System.out.print("Returns:- ");
		System.out.println(str.substring(7));
		
		//prints substring from 0-6, exclusive 6th index
		System.out.print("Returns:- ");
		System.out.println(str.substring(0,6));
		
		//prints the substring from 10-22 exclusive 22th index
		System.out.print("Returns:- ");
		System.out.println(str.substring(10,22));
		
	}
}
