class Reuse1{

static void on1(){  
 
}


public static int on2(){
       int x=10;
       int y=20;
       int c=x+y;
System.out.println(c);
return c;
}
}

class Reuse2 extends Reuse1{

 int m1(int a,int b){
 
 System.out.println("from the m1 method ");  
return 20;
}

public static void main(String[] args){

  Reuse2 y=new Reuse2();
         y.m1(20,40);
   
    y.on2();    
}

}