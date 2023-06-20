public class ThrowsExample{

public  void m1() throws ArithmeticException {

       System.out.println("Entering m1 method");

       int c=2/0;
  
}


public static void main(String[] args){
   
   ThrowsExample obj=new ThrowsExample();
                obj.m1();
    
}
}