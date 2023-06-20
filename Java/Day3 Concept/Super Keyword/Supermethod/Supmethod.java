class Ram{

  static int x=200;

  public void m1(){
 
    System.out.println("From super keyword");
  } 


}


class Supmethod extends Ram{

 static  int x=300;
  
 public void m1(){
   System.out.println("From sub class");
     super.m1();
 }

public static void main(String[] args){
   
Supmethod y=new Supmethod();
    y.m1();


}



}