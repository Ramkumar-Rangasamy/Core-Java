class Ram{

  static int x=200;

  public void m1(){
 
    System.out.println("From super keyword");
  } 


}


class Sup extends Ram{

 static  int x=300;
  
 public void m1(){
   System.out.println("From sub class");
   System.out.println(super.x);
 }

public static void main(String[] args){
   
Sup y=new Sup();
    y.m1();


}



}