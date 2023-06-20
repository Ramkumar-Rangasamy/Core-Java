import java.util.*;

public class TreeSetExample{

 public static void main(String[] args){

    Set<String> obj = new TreeSet<>();
                obj.add("woodpecker");
                obj.add("");
                obj.add("Toyota Fortuner.");
 			obj.add("");
                obj.add("Honda City");
                obj.add("Hyundai Verna");
                obj.add("Mahindra XUV500");
                obj.add("");
 			obj.add("Hyundai Verna");


     Iterator itr=obj.iterator();
   
     while(itr.hasNext()){
        System.out.println(itr.next());
     }
     
      //System.out.println(obj.get(2)); not using
 }

}