package RWI.Program;
import java.util.*;
public class StringJoiner {

	public static void main(String[] args) {
		StringJoiner joinStrings = new StringJoiner(",", "[", "]");
		//passing comma(,) and square- bracket as delimiter 
		
		//adding values to StringJoiner
		joinStrings.add("Scaler");
		joinStrings.add("By");
		joinStrings.add("InterviewBit");
		System.out.println(joinStrings);

	}

}
