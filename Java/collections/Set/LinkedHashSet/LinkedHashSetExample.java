import java.util.*;

class LinkedHashSetExample{
	
    public static void main(String[] args){

            Set<String>  orghash = new LinkedHashSet<>();
                         orghash.add("Maruti Swift");
                         orghash.add("Maruti Wagon");
                         orghash.add("Hyundai Creta");
                         orghash.add(" ");
                         orghash.add("woodpecker");
                         orghash.add("Mahindra XUV500");
                         orghash.add("Toyota Fortuner.");
                         orghash.add("Toyota Fortuner.");
                         orghash.add("Honda City");
                         orghash.add("Hyundai Verna");
                         orghash.add("Mahindra XUV500");
          
          // orghash.remove();

         Iterator itr = orghash.iterator();
         
		while(itr.hasNext()){

		    System.out.println(itr.next());
		} 			
          
             //total size
        // System.out.println(orghash.size());

             //specified  random access string take using get method based on index value but not access
       //  System.out.println(orghash.get(4));// not using 

             //contains usage checked the same string it have is true (or) not is false  
      //   System.out.println(orghash.contains("Mahindra XUV500"));

 	   //  System.out.println(orghash.contains("mahindra XUV500"));	
              
             //usage is list datas have or not it checked   
       //  System.out.println(orghash.isEmpty());

         

           
         
        
    }
}