package program;

class Bicyle{
	void displayFeatures() {
		System.out.println("Features:- Pedals, Manual power");
	}
}
class Motorbike extends Bicyle{
	void displayFeatures() {
		super.displayFeatures();
		System.out.println("Added feature by Motorbike: Engine");
	}
}
class ElectricBike extends Motorbike{
	void displayFeatures() {
		super.displayFeatures();
		System.out.println("New feature by Electric motor and battery");
	}
}
public class MultiLevel {
	public static void main(String args[]) {
		ElectricBike eb = new ElectricBike();
		eb.displayFeatures();
	}

}
