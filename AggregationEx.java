package RWI.Program;
import java.util.*;

class Student{
	 // attributes of student 
	private String studentName;
	private int studentId;
	
	//constructor of student class
	public Student(String studentName, int studentId)
	{
		this.studentName= studentName;
		this.studentId= studentId;
	}
	public int getstudentId() {
		return studentId;
	}
	public String getstudentName() {
		return studentName;
	}
	
}
class Department{
	private String deptName;
	private List<Student> students;
	
	//constructor of department class
	public Department(String deptName, List<Student> students)
	{
		this.deptName= deptName;
		this.students= students;
		
	}
	public List<Student>getStudents(){
		return students;
	}
	public void addStudent(Student student)
	{
		students.add(student);
	}
}
class Institute{
	private String instituteName;
	private List<Department>departments;
	
	//constructor
	public Institute(String instituteName,List<Department>departments)
	{
		//this keyword refers to current instance itself
		this.instituteName= instituteName;
		this.departments= departments;
	}
	public void addDepartment(Department department)
	{
		departments.add(department);
		
	}
	//method of institute class count tital number of student
	public int getTotalStudentsInstitute()
	{
		int noOfStudents = 0;
		List<Student>students = null;
		
		for(Department dept : departments) {
			students = dept.getStudents();
			
			for(Student s : students) {
				noOfStudents++;
			}
		}
		return noOfStudents;
	}
}

// main class
public class AggregationEx {
	
	public static void main(String args[]) {
		//creating  independent student object
		Student s1= new Student("Parul", 1);
		Student s2= new Student("Sachin", 2);
		Student s3= new Student("Priya", 3);
		Student s4= new Student("rahul", 4);
		
		//creating an list of CSE Students
		List<Student> cse_students = new ArrayList<Student>();
		cse_students.add(s1);
		cse_students.add(s2);
		
		List<Student> ee_students= new ArrayList<Student>();
		ee_students.add(s3);
		ee_students.add(s4);
		
		//creating department  object with a student list using aggregation(department "has" students
		Department CSE = new Department("CSE", cse_students);
		Department EE = new Department("EE", ee_students);
		
		//creating an initial list of Department 
		List<Department> departments= new ArrayList<Department>();
		departments.add(CSE);
		departments.add(EE);
		
		// creating an intitute object with Department list using aggregation( Institute "has" Department)
		Institute institute = new Institute("BITS", departments);
		
		//Display message for better readability
		System.out.println("Total student in institute: ");
		
		//calling method to get total number of studentd in the institute and printing on console
		System.out.println(institute.getTotalStudentsInstitute());
	}
}
