package program;
abstract class Vehicle{
	abstract void start();
}
class Car1 extends Vehicle{

	@Override
	void start() {
		System.out.println(" Car start with self");
	}
	
}
class Bike extends Vehicle{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Bike Start with kick");
	}
	
}
public class Abstraction {
	public static void main(String args[]) {
		Car1 c = new Car1();
		c.start();
		Bike b = new Bike();
		b.start();
	}

}
