import java.util.*;
class LinkedlistExample{	
    public static void main(String[] args){

           List<String> order = new LinkedList<>();
                        order.add("Pigeon");
                        order.add("Peacock");
                        order.add("sprrow");
                        order.add("woodpecker");
                        order.add("owl");
                        order.add(" ");
                        order.add("crow");
                        order.add("kite");
                        order.add("Dove");
                        order.add("Dove");
          
          // order.remove(4);
          // order.clear();

         Iterator itr = order.iterator();
         
		while(itr.hasNext()){

		    System.out.println(itr.next());
		} 			
          
             //total size
        // System.out.println(order.size());

             //specified string take using get method based on index value
        // System.out.println(order.get(2));

             //contains usage checked the same string it have is true (or) not is false  
        // System.out.println(order.contains("Dove"));

 	    // System.out.println(order.contains("dove"));	
              
             //usage is list datas have or not it checked   
        // System.out.println(order.isEmpty());

         

           
         
        
    }
}