import java.util.*;
public class StackExample{

   public static void main(String[] args){

    Stack<String> obj = new Stack<>();
                 obj.push("surya");
                 obj.push("ram");
                  //obj.pop();
                 obj.push("subash");
                 obj.push("bharathi");
                 obj.push("bharathi");
obj.push("");
obj.push("bharathi");


      //    obj.pop();

     Iterator itr = obj.iterator();

      while(itr.hasNext()){
          System.out.println(itr.next());
      }

      System.out.println(obj.get(2));
     
   }
}