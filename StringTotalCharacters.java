package RWI.Program;

public class StringTotalCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Hello world";
		int count=0;
		System.out.println("Input String: "+ str);
		
		//count total character in the given string except space
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!= ' ')
				count++;
		}
		
		//Display total character
		System.out.print("The total number of charaters in the given string: "+count);
		 
	}

}
