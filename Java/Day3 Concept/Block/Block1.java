class Block1{

void m1(){

 System.out.println("non static method");
}

static{

 System.out.println("Static block ");
Block1 r=new Block1();
}

{

 System.out.println("Init block");
}
Block1(){

 System.out.println("constractor");

}


public static void main(String[] args){
    new Block1().m1();   
 System.out.println("main method ");

}
}