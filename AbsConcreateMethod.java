package program;

abstract class Concrete{
	abstract void show();
	void view() {
		System.out.println("this is concreate method of abstract");
	}
}
class Start extends Concrete{
	void show() {
		System.out.println("This");
	}
}
public class AbsConcreateMethod {
	public static void main(String args[]) {
		Start s= new Start();
		s.view();
		s.show();
	}

}
