package program;
 class Student{
	 void fee() {
		 System.out.println("Student_Fee = 20000");
	 }
 }
 class Student_Name extends Student{
	 void name() {
		 System.out.println("Student Name = Vaishnavi");
	 }
 }
 public class SingleInheritance {
	 public static void main(String args[]) {
		 Student_Name sn = new Student_Name();
		 sn.fee();
		 sn.name();
	 }
}
