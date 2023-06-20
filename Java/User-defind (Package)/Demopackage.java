package com.mypackage.ram;

public class Demopackage{

 public void methodone(){
    
   System.out.println("Methodone in Demopackage");
  }
 
  public static void methodtwo(){
   
    System.out.println("methodtwo in demopackage");
  }



public static void main(String[] args){

  Demopackage obj=new  Demopackage();

              obj.methodone();
                  methodtwo();


}

} 