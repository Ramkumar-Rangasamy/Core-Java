import java.util.Scanner;

class TwoNumber{
    static int a,b,c;
public static void main(String[] args){

 Scanner sc=new Scanner(System.in);

 System.out.println("Input first number : ");

   a=sc.nextInt();

 System.out.println("Input second number : ");
  
   b=sc.nextInt();

   c=a*b;
 System.out.println("Expected Output :"+c);

}

}