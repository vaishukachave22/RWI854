package program;
class Mother{
    public void feature(){
          System.out.println("Feature method inside Mother.");
    }
}

class Uncle{
    public void feature(){
          System.out.println("Feature method inside Uncle.");
    }
}

//let multiple inheritance be possible.
public class MultiInheritance1 extends Mother, Uncle{
	public static void main(String args[]){
    	MultiInheritance1 obj = new MultiInheritance1();
          //Ambiguity problem in method call which class display() method will be called.
          obj.feature();
    }
}