public class LeapYear {
    public static Boolean IsLeap(int year) {
        // your code goes here
        if(year%4==0){
          return true;
        }  
        else {
          return false;
        }
        
    }
    public static void main(String[] args){
    
        System.out.println(IsLeap(14));
    }
    
}