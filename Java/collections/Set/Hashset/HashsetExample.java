import java.util.*;

public class HashsetExample{

 public static void main(String[] args){

    Set<String> org = new HashSet<>();
    
     		 org.add("Maruti Swift");
                org.add("Maruti Wagon");
                org.add("Hyundai Creta");
                org.add("woodpecker");
                org.add("Mahindra XUV500");
                org.add("Mahindra XUV500");
               //  org.add(" ");
                org.add("Toyota Fortuner.");

     // System.out.println(org);
    
       // System.out.println(org.size());

     Iterator itr = org.iterator();
      
      // System.out.println(itr);   
       while(itr.hasNext()){
           
          System.out.println(itr.next());

       }


      	// System.out.println(org.get(4));  // not using

          

 }


}