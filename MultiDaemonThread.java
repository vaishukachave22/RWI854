package ExceptionHandling.program;

public class MultiDaemonThread extends Thread {
	public MultiDaemonThread(String name) {
		super(name);
	}
	public void run() {
		//checking whether the thread is daemon or not 
		if(Thread.currentThread().isDaemon()) {
			System.out.println(getName()+"is Daemon thread");
		}
		else {
			System.out.println(getName()+"is User thread");
		}
	}
	public static void main(String args[]) {
		MultiDaemonThread t1 = new MultiDaemonThread("t1");
		MultiDaemonThread t2 = new MultiDaemonThread("t2");
		MultiDaemonThread t3 = new MultiDaemonThread("t3");
		
		//setting user thread t1 to Daemon
		t1.setDaemon(true);
		
		//starting first 2 threads
		t1.start();
		t2.start();
		
		//setting user thread t3 to Daemon
		t3.setDaemon(true);
		t3.start();
	}
}
