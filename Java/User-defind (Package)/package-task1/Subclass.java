import com.mypackages.ramkumar.Packageclass;

public class Subclass{

 int x=10;
 int y=35;
  
 public void method3(){

   int c=x+y;
  System.out.println(c +" method3 in Subclass");

 }


 public static void method4(){

   System.out.println(" method4 in Subclass");
 }

 public static void main(String[]args){


     new Packageclass().method1();
          Packageclass.method2();
                       
      
   Subclass obj1=new Subclass();
  
            obj1.method3();
                 method4();

   System.out.println("main method in Subclass"); 
           
 }



}