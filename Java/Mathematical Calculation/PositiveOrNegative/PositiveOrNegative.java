import java.util.Scanner;

class PositiveOrNegative{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);

 
 System.out.println("Expected Output :");

  int a=sc.nextInt();
 if(a > 0){
   System.out.println("Number is positive");
 }
 else if(a < 0){
   System.out.println("Number is negative");
 }


}
}