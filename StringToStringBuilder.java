package RWI.Program;

public class StringToStringBuilder {
	public static void main(String args[]) {
		String str[]= {"java ","program ","language"};
		StringBuilder sb= new StringBuilder();
		sb.append(str[0]);
		sb.append(""+str[1]);
		sb.append(""+str[2]);
		System.out.println(sb.toString());
	}

}
