abstract class KGM{


 public  void m1(){

    System.out.println("Abstract Class");
 }

 abstract void m2();

}



class Test extends KGM{

 void m2(){

   System.out.println("defind the m2 method");
 }


public static void main(String[] args){

  Test t=new Test();
       t.m2();
       t. m1();  
}

}