package ExceptionHandling.program;

public class MultiThreadImple extends Thread {
	public void run() {
		System.out.println("My thread is in running state.");
	}
	public static void main(String args[]) {
		MultiThreadImple obj = new MultiThreadImple();
		obj.start();
	}
}
