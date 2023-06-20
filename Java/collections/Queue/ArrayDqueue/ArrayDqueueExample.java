import java.util.*;

public class ArrayDqueueExample{

  public static void main(String[] args){

    Deque<String> obj=new ArrayDeque<>();
  
                    obj.add("java");
                    obj.add("HTML"); 
                    obj.add("CSS");
                    obj.add("JavaScript");
                    obj.add("JavaScript");
                    obj.add("MySQL");
     
      //System.out.println(obj.peek()); //first one print after all print
        System.out.println(obj.element()); //first one print
          
         
   
        Iterator itr=obj.iterator();
		
      while(itr.hasNext()){
         
        System.out.println(itr.next());
	    
       }
       //System.out.println(obj.get(1));

         
  }

}