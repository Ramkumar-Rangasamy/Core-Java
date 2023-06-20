class Overloading{
 
 public static void m1(int a){

   System.out.println("overloading m1 same method but different parameters (same method call 1)");

 }

 public static int m1(float b){

    System.out.println("overloading m1 same method but different parameters  (same method call 2)");
return 20;
 }

public  static int m1(double c){

   System.out.println("overloading m1 same method but different parameters  (same method call 3)");
retrun 20;
 }
 
public static void main(String[] args){

 m1(10);
 m1(2.0f);
 m1(3.0d);


}

}