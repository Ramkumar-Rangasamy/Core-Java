class ReuseValue{
 
    public void m1(){
         System.out.println("print the two variable so answer is");
    }
    
    public static int m2(){
     
     return 200;
    }
    
    public static void main(String[] args){
     
       int y= m2();
       int x=100;
       ReturnStatement rel= new ReturnStatement();
       rel.m1();
       System.out.println(y+x);  //reuse 


    }











}