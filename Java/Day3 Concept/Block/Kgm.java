class Kgm{

 public static void m1(){

   System.out.println("Static Method");
 }

 public void m2(){
  
   System.out.println("non-Static Method");
 }

 static{
    
  System.out.println("Static block");
     new Kgm().m2();
 }

 {
  System.out.println("Init block");

 }

 Kgm(){
    System.out.println("constartor method");
 }



public static void main(String[] args){
           m1();
    Kgm r=new Kgm();
        
     
 }


}