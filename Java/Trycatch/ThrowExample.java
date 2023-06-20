public class ThrowExample{


public void validate(int age){

if(age<18){
   throw new ArithmeticException("thambi ne innum valaranum");

}else{

 System.out.println("not validate sorry");
}


}

public static void main(String[] args){

ThrowExample obj=new ThrowExample();
             obj.validate(14);


}
}