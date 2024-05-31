package program;

abstract class Animal{
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	//Abstract method to be implemented by subclasses
	public abstract void makeSound();
	
}
 class Dog extends Animal{
	 public Dog(String name) {
		 super(name);
	 }
	 //Implementation of the abstract method
	 public void makeSound() {
		 System.out.println("woof!");
		 
	 }
 }
public class Abstraction1 {
	public static void main(String args[]) {
		//Create an instance of dog using the animal reference
		Animal a= new Dog("Fido");
		//call the makeSound() method of dog
		a.makeSound();
		}
	

}
