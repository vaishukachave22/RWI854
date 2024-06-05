package RWI.Program;

public class Palindrom {
	public static void main(String args[]) {
		int r,sum=0;;
		int n=454;
		int temp=n;
		while(n!=0) {
			r=n%10;
			sum=(sum*10)+r;
			n/=10;
		}
		if(temp==sum) {
			System.out.println("Palindrom Number");
			
		
		}
		else
			System.out.println("Not palindrom Number");
		
	}

}
