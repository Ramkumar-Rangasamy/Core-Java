import com.mypackage.ram.Demopackage;

class Democlass{

  static void m1(){

   System.out.println("this is m1 method Democlass");

  }

  void m2(){
   
   System.out.println("this is m2 method Democlass");
  }


public static void main(String[] args){

   Demopackage obj=new Demopackage();
               obj.methodone();

              m1();
       
    Democlass obj1=new Democlass();
              obj1.m2();        

}

}