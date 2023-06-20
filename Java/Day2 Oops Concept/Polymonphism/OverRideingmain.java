 class OverRideing{

      void m1(){

         System.out.println("parent class method");
    }

}

class OverRideingmain extends OverRideing{

 
    static void m1(){

       System.out.println("child class method");
   }


public static void main(String[] args){

OverRideingmain e=new OverRideingmain();
                e.m1();


}


}