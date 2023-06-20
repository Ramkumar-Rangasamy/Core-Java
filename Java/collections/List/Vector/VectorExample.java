import java.util.*;

public class VectorExample{

 public static void main(String[] args){

   Vector<String> org = new Vector<String>();

                org.add("woodpecker");
                org.add("Mahindra XUV500");
                org.add("Toyota Fortuner.");
 			org.add(" ");
                org.add("Honda City");
                org.add("Hyundai Verna");
                org.add("Mahindra XUV500");
 		     org.add("Hyundai Verna");


     Iterator itr=org.iterator();
   
     while(itr.hasNext()){

        System.out.println(itr.next());
     }

     // System.out.println(org.size());
      //System.out.println(org.clone()); //using clone method after see that array [] format
    //  System.out.println(org.get(2)); //random accessed 

      //System.out.println(org.firstElement());
      
 }

}