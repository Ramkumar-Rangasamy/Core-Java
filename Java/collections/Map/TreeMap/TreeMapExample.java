import java.util.*;
public class TreeMapExample{

   public static void main(String[] args){

    NavigableMap<String,String> org=new TreeMap<>();

                                 org.put("name1","subash");
					   org.put("name2","ram");
					   org.put("name3","surya");
                                 org.put("","");
					   org.put("name5","bharathi");
					   org.put("name6","raja");
                                  org.put("name6","raja");
              
              // org.clear();
              //   org.replace("name4","","Ajithkumar");
              // org.replaceAll((k,v)->"close");

               // org.remove("name5");
                    
              //System.out.println(org.descendingMap());

              //System.out.println(org.headMap("name4",true)); //lessthen or equalto
               //System.out.println(org.headMap("name4",false));

             //  System.out.println(org.tailMap("name5",true)); //greaterthen or equalto
             //  System.out.println(org.tailMap("name5",false));

                //System.out.println(org.subMap("name1",true,"name5",true));
              // System.out.println(org.subMap("name1",false,"name5",false));
          
        // for(Map.Entry mapj:org.entrySet()){

         //   System.out.println(mapj.getKey()+" "+mapj.getValue());
        // }
  
        System.out.println(org.get("name3","surya"));

   } 

}