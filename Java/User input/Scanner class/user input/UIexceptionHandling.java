import java.util.Scanner;

class UIexceptionHandling{
public static void main(String[] args){

	static int a,b,c;

  Scanner sc=new Scanner(System.in);

  System.out.println("Please Enter the 1st value =");

    a=sc.nextInt();

  System.out.println("Please Enter the 2nd value =");

    b=sc.nextInt();

    try{

     c=a+b;

    }catch(Exception e){
     
       System.out.println(e);

       System.out.println("please Enter the current value");

    }finally{
      
       System.out.println("thank you welcome back...");
    } 

 System.out.println("Total value = "+c);
}

}