package ExceptionHandling.program;

public class MultiThreadRunnable implements Runnable  {
	public void run() {
		System.out.println("My thread is in running state.");
	}
	public static void main(String args[]) {
		MultiThreadRunnable obj = new MultiThreadRunnable();
		Thread tobj = new Thread(obj);
		tobj.start();
	}
}
