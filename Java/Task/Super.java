class Test{

  Test(){
      this(4);
      System.out.println("emty constartor from Test class");
  }

  Test(int a){
      this(34.90f);
     System.out.println("Int constartor from Test class");
  }

  Test(float b){
      
     System.out.println("Float constartor from Test class");
  }


}

class Super extends Test{

 
Super(){
     this(33893l);
    System.out.println("emty constartor from Super class");
}

Super(long a){
     super(); 
   System.out.println("long constartor from Super class");

}

public static void main(String[] args){

     Super ref=new Super();
           
}

}