class ReuseReferances{
    
   public static int m1(){
       int a=545;
       int b=3455;
       int c=a+b;
        System.out.println(c);

     return c;
   }
  
  
   public static void main(String[] args){
      int a=m1();
      
      int x=200;
      int y=200;
      int z=x+y;
      
      System.out.println(z+c);
      
   } 


}