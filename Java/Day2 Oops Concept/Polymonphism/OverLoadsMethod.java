class OverLoadsMethod{

void taking(){

System.out.println("empty method");

}
void talk(int a){
 
System.out.println("Hello");

}

public static void main(String[] args){

 OverLoadsMethod ob=new OverLoadsMethod();
                 ob.talk(2);    

}

}