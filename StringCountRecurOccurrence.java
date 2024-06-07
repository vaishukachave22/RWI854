package RWI.Program;

public class StringCountRecurOccurrence {
	public static int countCharsRecur( String str, char c, int idx) {
		if(idx >= str.length())
			return 0;
		
		else {
			int count = 0;
			if(str.charAt(idx) == c)
				count = 1;
			return count + countCharsRecur(str, c, idx + 1);
			
		}
	
	}
	public static int countChars(String s, char c) {
		return countCharsRecur(s,c,0);
	}
	
	public static void main(String args[]) {
		String s= " Java programming ";
		int charCountOfA = countChars(s,'a');
		int charCountOfG = countChars(s,'g');
		int charCountOfE = countChars(s,'e');
		
		System.out.println("The string is: "+ s);
		System.out.println("Character count of 'a': "+ charCountOfA);
		System.out.println("Character count of 'g': "+ charCountOfG);
		System.out.println("Character count of 'e': "+ charCountOfE);
	}

}
