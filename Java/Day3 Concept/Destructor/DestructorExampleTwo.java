public class DestructorExampleTwo{
 
public static void main(String[] args){

System.out.println("System.gc(Garbage Collection)");

 DestructorExampleTwo ob=new DestructorExampleTwo();
   
    ob=null;
    System.gc();//used to recycle unused object
             
  System.out.println("gc has been calling");

}

}