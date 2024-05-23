class Calculate{
    public void show(){
        System.out.println("In calculate show");

    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}

public class FinalMethod {
    public static void main(String args[]){
        Calculate cal= new Calculate();
        cal.show();
        cal.add(4, 5); 
    }

    
}