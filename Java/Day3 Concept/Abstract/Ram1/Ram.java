abstract class KGM1{

  public static void m1(){

      System.out.println("ordinary class");

   } 

   abstract  void m2(); 
   abstract  void m3();
   abstract  void m4();
}


class Ram extends KGM1{
    
     void m2(){
      int a=10;
      int b=20;
      int c=a+b;
      System.out.println(c+" this defind in m2 method");

     }
    
     void m3(){
       float a=0.10f;
       float b=0.50f;
       float c=b-a;
       System.out.println(c+" this defind in m3 method");
     }

    void m4(){
       String a="ramkumar this is over time you";
       System.out.println(a);
     }



   public static void main(String[] args){

     Ram r=new Ram();
         r.m1();
         r.m2();
         r.m3();
         r.m4();

  }
}