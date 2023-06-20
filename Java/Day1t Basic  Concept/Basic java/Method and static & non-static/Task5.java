public class Task5{

      static int a;
             int b;


      public static int m1(){
           m2();
       return 10;
      }
       

      public static int m2(){ 
            Task5 g=new Task5();
                 
               System.out.println(g.b=20);
                   

      return 10;
      }

	 public int m3(){
       
      return 20;  
      }

      public static void main(String[] agrs){
        Task5 a1=new Task5();
         int  a2=100;
          System.out.println(a2+a1.m3()); 
           m1(); 

     }



}