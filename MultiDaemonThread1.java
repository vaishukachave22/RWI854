package ExceptionHandling.program;

public class MultiDaemonThread1 extends Thread{
	public void run() {
		System.out.println("Thread Name: "+ Thread.currentThread().getName());
		System.out.println("Check if its DaemonThread:"+ Thread.currentThread().isDaemon());
		
}
	public static void main(String args[]) {
		MultiDaemonThread1 t1 = new MultiDaemonThread1();
		MultiDaemonThread1 t2 = new MultiDaemonThread1();
		t1.start();
		
		//exception as the thread is already started  
		t1.setDaemon(true);
		t2.start();
	}
	

}
