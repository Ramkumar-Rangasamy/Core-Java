class A{

  static int y=100;

 public static void m1(){
   System.out.println("from the m1 method output");
}
public static void m2(){
    System.out.println("from the m2 method output");
}
}

class B{

  public static void m3(){
   System.out.println("from the m3 method output");
  }

  public static void main(String[] args){
        A.m1();
        A.m2();
          m3();
       int a=20;
       int b=20;
       int c=a+b;
        System.out.println(c+A.y);

  }





}