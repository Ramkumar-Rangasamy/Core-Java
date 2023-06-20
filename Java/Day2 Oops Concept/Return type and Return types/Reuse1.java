class Reuse1{

static void on1(int b){
  on2();  
 
}


public static int on2(){
       int x=10;
       int y=20;
       int c=x+y;

return c;
}


public static void main(String[] args){
 
   int r=on2();
   on1(r);
    
   
}

}