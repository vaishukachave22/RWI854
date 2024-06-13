package ExceptionHandling.program;

public class MultiPriorityThread1 extends Thread{
	public MultiPriorityThread1(String name1) {
		super(name1);
	}
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(getName()+"is User thread");
		}
		else
		{
			System.out.println(getName()+"is User thread");
		}
		System.out.println(getName()+"Priority"+Thread.currentThread().getPriority());
	}
	public static void main(String args[]) {
		MultiPriorityThread1 D1 = new MultiPriorityThread1("D1");
		MultiPriorityThread1 D2 = new MultiPriorityThread1("D2");
		MultiPriorityThread1 D3 = new MultiPriorityThread1("D3");
		
		D1.setDaemon(true);
		D1.start();
		D2.start();
		D3.start();
		D3.setDaemon(true);
	}

}
