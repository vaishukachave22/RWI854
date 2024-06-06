package RWI.Program;

import java.util.Arrays;

public class ArrayInsertionSort {
	void insertionSort(int array[]) {
		int size = array.length;
		
		for(int step=1;step<size;step++) {
			int key= array[step];
			int j= step-1;
			
			//compare key with each element on left of it  until an element samaller than, it is found, for descending order, change key<array[j]to key>array[j].
			while(j>=0 && key<array[j]) {
				array[j+1]=array[j];
				j--;
			}
			
			//place key at after the element just smaller than it.
			array[j+1]=key;
		}
	}
	
	public static void main(String args[]) {
		int[] data= {9,5,1,4,3};
		ArrayInsertionSort is =  new ArrayInsertionSort();
		is.insertionSort(data);
		System.out.println("Sorted Array in Ascending Order: ");
		System.out.println(Arrays.toString(data));
	}

}
