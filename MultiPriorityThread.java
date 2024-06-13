package ExceptionHandling.program;

public class MultiPriorityThread extends Thread {
	public MultiPriorityThread(String name1)
	{
		super(name1);
	}
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(getName()+ "Is Daemon thread");
			
		}
		else
		{
			System.out.println(getName()+ "is User thread");
		}
		System.out.println(getName()+ "Priority"+ Thread.currentThread().getPriority());
	}
	public static void main(String args[]) {
		MultiPriorityThread D1 = new MultiPriorityThread("D1:-");
		MultiPriorityThread D2 = new MultiPriorityThread("D2:-");
		MultiPriorityThread D3 = new MultiPriorityThread("D3:-");
		
		D1.setDaemon(true);
		D1.start();
		D2.start();
		D3.setDaemon(true);
		D3.start();
	}
}
