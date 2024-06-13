package ExceptionHandling.program;

public class MultiThreadPriority extends Thread{
	public void run() {
		System.out.println("Child Thread ");
		System.out.println(Thread.currentThread().getPriority());
	}
	public static void main(String args[]) {
		System.out.println(Thread.currentThread().getPriority());
		MultiThreadPriority p = new MultiThreadPriority();
		p.setPriority(7);
		p.start();
		
	}
}
