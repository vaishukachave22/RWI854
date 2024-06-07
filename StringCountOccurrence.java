package RWI.Program;

public class StringCountOccurrence {
	public static int countChars(String str, char c)
	{
		int count = 0;
		for(int i = 0;i<str.length();i++) {
			char currChar = str.charAt(i);
			if(currChar == c)
				count +=1;
		}
		return count;
	}
	public static void main(String args[]) {
		String s= " Java is high level programming language!";
		int charCountOfA = countChars(s,'a');
		int charCountOfG = countChars(s,'g');
		int charCountOfE = countChars(s,'e');
		
		System.out.println("The string is: "+ s);
		System.out.println("Character count of 'a': "+ charCountOfA);
		System.out.println("Character count of 'g': "+ charCountOfG);
		System.out.println("Character count of 'e': "+ charCountOfE);
	}
}
