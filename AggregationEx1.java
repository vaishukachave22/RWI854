package RWI.Program;

class Studentn{
	private int sid;
	private String sname;
	public Studentn(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid= sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
}
class Department1{
	private String dname;
	private Studentn student;
	public Department1(String dname,Studentn student) {
		super();
		this.dname = dname;
		this.student = student;
	}
	void show()
	{
		System.out.println("Department Name:-"+ dname + "\n"+ "Student:-" +student.getSid()+ "" + student.getSname());
	}
}

public class AggregationEx1 {
	public static void main(String args[]) {
		Studentn s1= new Studentn(121,"Sneha");
		Studentn s2= new Studentn(122, "Sakshi");
		
		Department1 d= new Department1("Computer Science", s1);
		Department1 d1= new Department1("polytechnic:- ",s2);
		d.show();
		d1.show();
	}
}
