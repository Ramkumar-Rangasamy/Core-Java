import java.util.*;

public class ArraylistExample{

  public static void main(String[] args){

        //arraylist object not class object
     //ArrayList<String> obj=new ArrayList<>();
       List<String> obj=new ArrayList<>();
                       obj.add("Ramkumar");                 
                       obj.add("bharathi");
                       obj.add("");
                       obj.add("surya");
                       obj.add("subash");
                       obj.add("subash");
                      
     
     //obj.remove(4);
     //obj.clear();

    //Iterator itr=obj.iterator();
           
    //while(itr.hasNext()){
     //  System.out.println(itr.next());
   // } 

    int size=obj.size();
     System.out.println(size);  


    System.out.println(obj.get(5));	 
             
    //System.out.println(obj.contains("ramkumar"));
    //System.out.println(obj.isEmpty());
  }

}