class TryExample{
 static int a,b,c;
public static void m1(){
  
 try{
   a=100;
   b=200;
   c=a+d;
  System.out.println(c);  

 }catch(Exception e){
    throw new ArithmeticException("thambi ne innum valaranum");
 //e.printStackTrace();

 }
 
}

public static void main(String[] args){

m1();

}



}