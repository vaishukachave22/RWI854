package program;

public class EncapsulationPerson {
	private String name;
	private int age;
	//constructor
	public EncapsulationPerson(String name, int age) {
		this.name=name;
		this.age=age;
	}
	//Getter for name 
	public String getName() {
		return name;
	}
	//setter for name
	public void setName(String name) {
		this.name = name;
	}
	//getter for age
	public int getAge() {
		return age;
	}
	//setter for age
	public void setAge(int age) {
		if(age>0) {
			this.age = age;
		}else {
			System.out.println("Age cannot be negative.");
		}
	}
	//Display person information 
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationPerson p = new EncapsulationPerson("Alice", 30); //access and modify fields using getter and setters
		p.setName("Bob");
		p.setAge(25);
		p.displayInfo();
	}

}
