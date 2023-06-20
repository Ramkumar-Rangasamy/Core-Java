class Superclass{

 int x=100;

void m1(){

System.out.println("Super class method");
}

void m2(){
System.out.println("Super class m2 method");
}

}


class Subclass extends Superclass{

static int x=200;

void m1(){

System.out.println("Sub class method");

  super.m2();
  super.m1();
 

}

public static void main(String[] args){

Subclass re= new Subclass();

re.m1();
System.out.println();

}



} 