class Test{

 Test(){
  this(20);
 System.out.println("first constructor method");
 }


 Test(int a){
   this(10.5f);
 System.out.println("second constructor method");
 }


 Test(float b){
  System.out.println("Third constructor method");
 }


  static void  m1(){

  System.out.println("Welcome this() method");

 }

 

public static void main(String[] args){
      m1();
 Test r=new Test();
     

 }
}
