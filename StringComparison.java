package RWI.Program;

public class StringComparison {
	public static void main(String args[]) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		System.out.println(str1==str2);
		//true because both points to same memory allocation
		
		System.out.println(str1==str3);
		//false because str3 refers to instance created in heap
		
		System.out.println(str1.equals(str3));
		//true because both share same content
		//even if both are different string objects
	}

}
