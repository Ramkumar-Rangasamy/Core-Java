public class Test3{
	int x=20;
	static int y=30;

      void m1(){
       int z=50;
 	System.out.println(z+x);
      }
       
      void m2(){
        m3();
      }

      static void  m3(){
        Test3 ref=new Test3();
            ref.m1();
            int f=30;
	    System.out.println(y+f);
      }

      void m4(){
       m2();
           
     }
	

public static void main(String [] args){
        Test3 g=new Test3();
          g.m4();
}}