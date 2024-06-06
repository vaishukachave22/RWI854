package RWI.Program;
import java.util.*;
public class ArrayBubbleSort {
	
	//perform the bubble sort
	static void bubbleSort(int array[]) {
		int size= array.length;
		
		//loop to access each array element
		for(int i=0;i<size-1;i++)
			
			//loop to compare array elements
			for(int j=0;j<size-i-1;j++)
				
			//compare two adjacent element
			// are not in the intended order
			if(array[j]>array[j+1]) {
			int temp = array[j];
			array[j]=array[j+1];
			array[j+1]=temp;
			}
	}


public static void main(String args[]) {
	int[] data= {-2,45,0,11,-9};
	
	//call method using class name
	ArrayBubbleSort.bubbleSort(data);
	
	System.out.println("Sorted Array in ascending Order: ");
	System.out.println(Arrays.toString(data));
}
}
