interface KGM{

   int y=100; 
 
  void m1();
  void m2();
  void m3();
  void m4();
  void m5();




}
class Ram implements KGM{


 public static void m6(){
    System.out.println("ordinary method from Ram class");
 }

 public void m1(){
    int a=100;
    int b=200;
    System.out.println(a+b+"from m1 method overrideing");
 }
 public  void m2(){
   long a=1223333444l;
   long b=899433747437l;
   long c=49734937479l;
   System.out.println(a+b-c+"from m2 method overrideing");
 }
 public void m3(){
  float a=0.5f;
  float b=0.15f;
  System.out.println(a-b+"from m3 method overrideing"); 
 }
 public void m4(){
   char a='A';
   char b='B';
   System.out.println(a+b+"from m4 method ");
  }
 public void m5(){
   System.out.println("from m5 method ");
   }


public static void main(String[] args){

      Ram x=new Ram();
          x.m1();
          x.m2();
          x.m3();
          x.m4();
          x.m5();
     System.out.println(y);
 }




}