package program;

	class Employee{
		String name;
		int id;

		Employee(String name, int id){
			this.name=name;
			this.id=id;
	
		}

		void display() {
			System.out.println("Name: " + name + ",ID:" + id);
		}
	}
	interface JavaDeveloper{
		void writeJavaCode();
	}
	interface PythonDeveloper{
		void writeJavaCode();
	}
	class FullStackDeveloper extends Employee implements JavaDeveloper, PythonDeveloper{
		FullStackDeveloper(String name, int id){
			super(name,id);
			
		}
		public void writeJavaCode() {
			System.out.println(name + "is writing java Code.");
		}
		public void writePythonCode() {
			System.out.println(name + "is writing code.");
		}
	}
	class HybridCompany {
		public static void main(String args[]) {
			FullStackDeveloper developer = new FullStackDeveloper("Esha", 101);
			developer.display();
			developer.writeJavaCode();
			developer.writePythonCode();
		}

	}

