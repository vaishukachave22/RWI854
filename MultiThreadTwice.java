package ExceptionHandling.program;

public class MultiThreadTwice extends Thread {
	public void run() {
		System.out.println("Thread is executing now.....");
	}
	public static void main(String args[]) {
		MultiThreadTwice t1 = new MultiThreadTwice();
		t1.start();
		t1.start();
		
	}

}
