package ExceptionHandling.program;

public class DaemonThread extends Thread {
	public void run() {
		System.out.println("This is child Thread");
	}
	public static void main(String args[]) {
		System.out.println("parent thread");
		DaemonThread d = new DaemonThread();
		
		d.setDaemon(false);
		d.start();
	}
	

}
