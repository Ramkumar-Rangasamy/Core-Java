class Autoboxing{

public static void main(String[] args){

 System.out.println("This all in Autoboxing in wrapper class");

 int a=20;
 byte b=3;
 short c=2;
 float d=3.0f;
 double e=455.000d;
 boolean f=false;
 char g='a';
 long h=3984333430454l;

 Integer obj =Integer.valueOf(a);
    System.out.println(obj);

 Byte obj1=Byte.valueOf(b);
    System.out.println(obj1);

 Short obj3=Short.valueOf(c);
    System.out.println(obj3);

 Float obj4=d;
   System.out.println(obj4);
 
 Double obj5=e;
   System.out.println(obj5);

 Boolean obj6=f;
   System.out.println(obj6);

 Character obj7=Character.valueOf(g);
   System.out.println(obj7);

 Long obj8=h;
   System.out.println(obj8);
}

}