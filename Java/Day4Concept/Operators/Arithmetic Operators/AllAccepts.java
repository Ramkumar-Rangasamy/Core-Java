import java.util.Scanner;

class AllAccepts{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);

System.out.println("Input 1st integer : ");

 int a=sc.nextInt();

System.out.println("Input 2nd integer : ");

 int b=sc.nextInt();


System.out.println("Sum of two integers : "+(a+b));
System.out.println("Difference of two integers : "+(a-b));
System.out.println("Product of two integers : "+(a*b));
System.out.println("Average od two integers : "+(a+b)/2);
System.out.println("Distance of two integers : "+(a-b));
System.out.println("Max integer : "+ Math.max(a,b));
System.out.println("Max integer : "+ Math.min(a,b));

}

}