package ExceptionHandling.program;
class YoungerAge extends RuntimeException{
	YoungerAge(String message){
		super(message);
	}
}
public class Exception_throw {
	public static void main(String args[]) {
		int age = 32;
		if(age<18) {
			throw new YoungerAge("Vikash you are not eligible for vote");
			
		}
		else {
			System.out.println("vikash you are eligible for vote");
		}
	}

}
