import java.util.Scanner;

class ScannerTwoInput{

public static void main(String[] args){

 Scanner sc=new Scanner(System.in);

System.out.print("ENTER THE FIRST NUMBER : ");

 int a=sc.nextInt();

 System.out.print("ENTER THE SECOND NUMBER : "); 
  
 int b=sc.nextInt(); 

   
 int c=a+b;
 System.out.println("Expected Output :"+ c);
}

}