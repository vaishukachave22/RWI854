package RWI.Program;

import java.util.Arrays;

public class ArrayMinMax {
	public static void main(String args[]) {
		int a[]= {1,423,6,46,34,23,13,53,4};
		
		Arrays.sort(a);
		
		System.out.println("min:- "+ a[0]+ "\nMax:- "+a[a.length-1]);
	}

}
