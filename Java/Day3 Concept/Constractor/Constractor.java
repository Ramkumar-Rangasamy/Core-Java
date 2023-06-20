class Constractor{

Constractor(){
     
   System.out.println("Constractor1");
 }

Constractor(int a){
        this();
   System.out.println("Constractor2");
 }




 public static void main(String[] args){
     System.out.println("main method");
    Constractor r=new Constractor(20);
   

 }

}