class CallByReferance{

 public static void m1(int a){
    System.out.println(a);
 }


 public static void main(String[] args){
   int x=100;
   int y=200;
   int a=x+y;
   System.out.println(x);
   m1(a);
 }

}