class InheritancesA{

public static void m1(){

System.out.println("this is a Inheritances class A method m1");

}

public void m2(){

System.out.println("this is a Inheritances class A method m2 ");

}

}




class InheritancesB extends InheritancesA {

public static void m3(){

System.out.println("this is a Inheritances class B method m3");

}

public void m4(){

System.out.println("this is a Inheritances class B method m4");

}

 
public static void main(String[] args){
 
 m1();
  InheritancesB b=new InheritancesB();
                b.m2();
                b.m4();
 
 



}

}
