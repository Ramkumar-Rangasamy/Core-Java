class Unboxing{

public static void main(String[] args){

   Integer obj=new Integer(2);
       int a=obj.intValue();    
       System.out.println(a);

   Float obj1=new Float(4.00f);
       float b=obj1.floatValue();
       System.out.println(b);

   Double obj2=new Double(467.000d);
       double c=obj2.doubleValue();
       System.out.println(c);
     
   Long obj3=new Long(47843644346l);
       long d=obj3.longValue();
      System.out.println(d);   
     
   Short obj4= 4;
      short e=obj4.shortValue();
       System.out.println(e);  

   Character obj5=new Character('a');
     char f=obj5.charValue();
     System.out.println(f);

   Boolean  obj6=new Boolean(false);
      boolean g=obj6.booleanValue();
      System.out.println(g);

   Byte obj7=2;
     byte h=obj7.byteValue();
     System.out.println(h);
}


}