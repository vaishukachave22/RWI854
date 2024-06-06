package RWI.Program;
import java.util.*;
public class StringBuffer {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb.capacity());
		
		StringBuilder sbr = new StringBuilder("String buffrer");
		System.out.println(sbr);
		sbr.append("Class");
		System.out.println(sbr);
		sbr= new StringBuilder("Scaler");
		System.out.println(sbr);
	}

}
