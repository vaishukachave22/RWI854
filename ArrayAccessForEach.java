package RWI.Program;

public class ArrayAccessForEach {
	public static void main(String args[]) {
		//create an array
		int[] number = {1,2,4,6,8};
		
		//using for each loop to go through each element 
		for(int i: number) {
			System.out.println(i);
		}
	}

}
