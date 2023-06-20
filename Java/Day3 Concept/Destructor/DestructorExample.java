public class DestructorExample{

public static void main(String[] args){

System.out.println("Finalize method in Destructors");

DestructorExample ob=new DestructorExample();
   

                 ob.finalize();


}

protected void finalize(){

 System.out.println("constructor is destroyed by finalize method ");
}


}