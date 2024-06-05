package RWI.Program;

public class Main {
	public static void main(String args[]) {
		int temp, size;
		int a[]= {9,7,6,5,5,4};
		size=a.length;
		
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(a[i]>a[j]) {
					temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("This second largest number is: " +a[size-2]);
	}
}
