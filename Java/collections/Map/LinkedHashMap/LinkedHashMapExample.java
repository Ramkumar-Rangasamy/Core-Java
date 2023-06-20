import java.util.*;
public class LinkedHashMapExample{

   public static void main(String[] args){

    Map<String,String> org=new LinkedHashMap<>();

                       org.put("name1","subash");
			     org.put("name2","ram");
			     org.put("name3","surya");
                       org.put("name4","");
			     org.put("name5","bharathi");
                        org.put("name5","bharathi");
			     org.put("name6","raja");
              

              
               // org.clear();

               //  org.replace("name5","bharathi","Ajithkumar");

              //  org.replaceAll((k,v)->"close");

                //org.remove("name5");
              

                 // org.putIfAbsent("name4","ram"); // it have value so not working
                 // org.putIfAbsent("name7","ram"); // add new entry (key/value)

          for(Map.Entry mapj:org.entrySet()){

            System.out.println(mapj.getKey()+" "+mapj.getValue());
           }
           
           System.out.println(org.get(3));


   } 

}