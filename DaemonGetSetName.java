package ExceptionHandling.program;

public class DaemonGetSetName extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("thread task1");
	}
	public void runs() {
		System.out.println(Thread.currentThread().getName());
		
	}
	public static void main(String args[]) {
		DaemonGetSetName d = new DaemonGetSetName();
		d.start();
		d.runs();
		System.out.println(Thread.currentThread().getName());
	}
}
