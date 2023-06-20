import java.util.Scanner;

class UserInput{

public static void main(String[] args){

 int a,b,c,d,e,f;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the 1st value = ");
 a=sc.nextInt();

 System.out.println("Enter the 1st value = ");
 b=sc.nextInt();
   
 c=a+b;
 d=a-b;
 e=a*b;
 f=a/b; 
 System.out.println("Total Count = "+c);
 System.out.println("Total Count = "+d);
 System.out.println("Total Count = "+e);
 System.out.println("Total Count = "+f);
 


}

}