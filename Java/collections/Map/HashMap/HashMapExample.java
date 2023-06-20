import java.util.*;

public class HashMapExample{

 public static void main(String[] args){
  
   Map<Integer,String> obj = new HashMap<>();

                           obj.put(1,"Surya");
				   obj.put(2,"Subash");
				   obj.put(3,"ram");
  				   obj.put(4,"");
				   obj.put(5,"ram");
                           obj.put(6,"Bharathi");
                           obj.put(6,"Bharathi");
                   
       // obj.replace(4,"Ramkumar");
       // obj.replace(4,"ram","Ramkumar");
          
         // obj.replaceAll((k,v)->"Batch 14");

     //  System.out.println(obj);

      // obj.putIfAbsent(7,"ram");
 
       // System.out.println(obj) ; 
    
         // obj.remove(7);

       // System.out.println(obj);

    for(Map.Entry org:obj.entrySet()){
    
      System.out.println(org.getKey()+" "+org.getValue()); 
             
    }
  
     System.out.println(obj.get(2));
 }    




}