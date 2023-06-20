public class Task3{

	public void m1(){
         int x=200;
         int y=300;
         int a=2;
         int b=x+y+a;
         System.out.println(b +" this is your output"); 
           m2(200);  
      } 

      public static void m2(int a){
          System.out.println(a);
      }

      void m3(){

        m2(100);
        int n=100;
        int n1=200;
        int n2=n1+n;
        System.out.println(n2);

      }

    
   	public static void main(String[] agrs){
          System.out.println("hello java take it easy");
             Task3 t = new Task3(); 
                 t.m1();
                   
           
      }
      










}