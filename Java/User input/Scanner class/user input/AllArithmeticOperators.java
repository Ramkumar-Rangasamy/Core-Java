import java.util.Scanner;

class AllArithmeticOperators{

public static void main(String[] args){

 Scanner sc=new Scanner(System.in);

System.out.println("Input first number : ");
  int a=sc.nextInt();

System.out.println("Input second number :");
  int b=sc.nextInt();

System.out.println("Expected Output : ");

 
System.out.println(a + " + " + b +" = "+(a+b));
System.out.println(a + " - " + b +" = "+(a-b));
System.out.println(a + " * " + b +" = "+(a*b));
System.out.println(a + " / " + b +" = "+(a/b));
System.out.println(a + "mod" + b +" = "+(a%b));
 

}


}