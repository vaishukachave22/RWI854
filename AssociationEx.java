package program;
import java.util.*;
class Bank{
	private String bname;
	private List<Employee1>employees;

	public Bank(String bname) {
		super();
		this.bname = bname;
	}
	public String getBname() {
		return bname;
		
	}
	public void setBname(String bname) {
		this.bname= bname;
	}
	public List<Employee1>getEmployee(){
		return this.employees;
		
	}
	public void setEmployee(List<Employee1>employees) {
		this.employees= employees;
	}
}
class Employee1{
	private String name;
	
	public Employee1(String name) {
		super();
		this.name= name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
}

public class AssociationEx {
	public static void main(String args[]) {
		Employee1 e= new Employee1("Deepak:- ");
		Employee1 e2= new Employee1("sneha:- ");
		List<Employee1>em = new ArrayList<Employee1>();
		
		em.add(e);
		em.add(e2);
		
		Bank b = new Bank("RBL");
		b.setEmployee(em);
		for(Employee1 emp:b.getEmployee()) {
			System.out.println(emp.getName()+"Belong to bank"+b.getBname());
		}
	}

}
