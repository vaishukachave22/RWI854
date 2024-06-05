package RWI.Program;

public class ArrayReference {

	public static void main(String[] args) {
		//create an array
		int[] arr= {1,2,4,6,8};
		int[] arr1;
		
		arr1=arr; //assigning arr array reference to arr1
		
		System.out.println(arr1[3]);

	}

}
