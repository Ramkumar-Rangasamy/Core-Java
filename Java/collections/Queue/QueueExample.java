import java.util.*;

public class QueueExample{

  public static void main(String[] args){

      Queue<String> obj=new PriorityQueue<>();
                    obj.add("java");
                     obj.add("");
                    obj.add("HTML"); 
                    obj.add("CSS");
                   
                    obj.add("JavaScript");
                    obj.add("MySQL");
                    obj.add("JavaScript");
                    obj.add("MySQL");
     
       // System.out.println(obj.peek()); //first one print after all print
       // System.out.println(obj.element()); //first one print
    
        Iterator itr=obj.iterator();
        
        while(itr.hasNext()){

           System.out.println(itr.next());
        }
 
      //  System.out.println(obj.get(3)); not using
         
  }

}