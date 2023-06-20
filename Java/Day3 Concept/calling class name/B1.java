class A1{
   static int x=100;
          int y=50;
    
 public static void m1(){
    System.out.println("this is a m1 method in class A1");

  }

 public void m2(){
   System.out.println("this is a m2 method in class A1");
  }
}


class B1{

 public static void m3(){

   A1.m1();  
   new A1().m2();
     
  // System.out.println(new A1().x);
     System.out.println(A1.x);


  System.out.println("this is a m3 method in class B1");

 }
 public void m4(){

 System.out.println("this is a m4 method in class B1");
 } 
 
 public static void main(String[] args){

  m3();
  B1 b=new B1();
     b.m4();
   
   A1 a=new A1();
      a.m2();
   System.out.println(a.y);  
     
 }

}