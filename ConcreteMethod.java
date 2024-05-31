package program;

//concrete class
 class ConcreteMethod {
	 // this method calculate product two number
	 static int product(int a, int b)
	 {
		 return a * b;
		 
	 }
	 static int sum(int a, int b) {
		 return a + b;
		 
	 }
	 public static void main(String args[]) {
		 int p = product(5,10);
		 int s = sum(5,10);
		 
		 //print product
		 System.out.println("product: " + p);
		 
		 //print sum
		 System.out.println("Sum: " + s);
	 }

}
