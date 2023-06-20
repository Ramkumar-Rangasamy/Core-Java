public class Task6{

	int x=20;
      static int y=30;
      
     public void m1(){
 		int z=50;
             System.out.println(z+x);

     }

     public void m2(){
         m3();
     }
     
     public static void m3(){
           
	   new Task6().m1();
          int f=30;
            System.out.println(y+f);
                  
     }
	
	public void m4(){
          m2();
      } 
      
	public static void main(String[] agrs){

          new Task6().m4();
            
            
      }

}